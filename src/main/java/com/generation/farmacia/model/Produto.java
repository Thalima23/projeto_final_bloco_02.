package com.generation.farmacia.model;

import java.math.BigDecimal;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.validation.constraints.DecimalMin;
import jakarta.validation.constraints.Digits;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

@Entity
@Table(name = "tb_produtos")
public class Produto {
	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
	
	@NotBlank(message = "O nome do produto é obrigatório!")
    @Size(min = 2, max = 100, message = "O nome deve ter entre 2 e 100 caracteres.")
	@Column(nullable = false, length = 255)
    private String nome;
	
	@NotBlank(message = "A descrição é obrigatória!")
    @Size(min = 5, max = 1000, message = "A descrição deve ter entre 5 e 1000 caracteres.")
	@Column(nullable = false, length = 255)
    private String descricao;
	
	@NotNull(message = "O preço é obrigatório!")
    @DecimalMin(value = "0.01", message = "O preço deve ser maior que zero!")
    @Digits(integer = 10, fraction = 2, message = "O preço deve ter no máximo 10 dígitos inteiros e 2 decimais")
    @Column(nullable = false)
    private BigDecimal preco;
	
	@NotBlank(message = "A Marca do produto é obrigatório!")
    @Size(min = 2, max = 100, message = "O nome do laboratório deve ter entre 2 e 100 caracteres.")
	@Column(nullable = false, precision = 12, scale = 2)
    private String marca;
	
	@Size(max = 5000, message = "A URL da capa do produto deve ter no máximo 5000 caracteres")
    @Column(length = 5000)
    private String foto; // URL da imagem do produto
	
	@ManyToOne
    @JsonIgnoreProperties("produtos")
    private Categoria categoria;

	
	 // Getters e Setters//
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getFoto() {
		return foto;
	}

	public void setFoto(String foto) {
		this.foto = foto;
	}

	public Categoria getCategoria() {
		return categoria;
	}

	public void setCategoria(Categoria categoria) {
		this.categoria = categoria;
	}
	


}
