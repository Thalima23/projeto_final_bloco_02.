package com.generation.farmacia.security;

import java.time.Duration;
import java.time.Instant;
import java.util.Date;

import javax.crypto.SecretKey;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.io.Decoders;
import io.jsonwebtoken.security.Keys;

@Component
public class JwtService {

    // Chave secreta para assinar os tokens
    private static final String SECRET = "5367566B59703373367639792F423F4528482B4D6251655468576D5A71347437";
    
    // Duração do token (60 minutos)
    private static final Duration EXPIRATION_DURATION = Duration.ofMinutes(60);
    
    private final SecretKey signingKey;
    
    public JwtService() {
        byte[] keyBytes = Decoders.BASE64.decode(SECRET);
        this.signingKey = Keys.hmacShaKeyFor(keyBytes);
    }
    
    private Claims extractAllClaims(String token) {
        return Jwts.parser() 
        		 .verifyWith(signingKey)
                 .build()
                 .parseSignedClaims(token)
                 .getPayload();
         }

    // Extrai o username (email) do token
    public String extractUsername(String token) {
        return extractAllClaims(token).getSubject();
    }

    // Extrai a data de expiração do token
    public Date extractExpiration(String token) {
        return extractAllClaims(token).getExpiration();
    }

    // Valida se o token é válido
    public boolean validateToken(String token, UserDetails userDetails) {
        Claims claims = extractAllClaims(token);
        return claims.getSubject().equals(userDetails.getUsername()) && 
               claims.getExpiration().after(new Date());
    }

    // Gera um token JWT a partir do username
    public String generateToken(String username) {
        Instant now = Instant.now();
        return Jwts.builder()
            .subject(username)
            .issuedAt(Date.from(now))
            .expiration(Date.from(now.plus(EXPIRATION_DURATION)))
            .signWith(signingKey)
            .compact();
    }
    
}