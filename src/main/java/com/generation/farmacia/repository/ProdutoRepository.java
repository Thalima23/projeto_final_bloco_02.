package com.generation.farmacia.repository;

import java.math.BigDecimal;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import com.generation.farmacia.model.Produto;

@Repository
public interface ProdutoRepository extends JpaRepository<Produto, Long> {
	
	// Extra - Busca específica: retorna todos os produtos que contêm o nome informado (ignora maiúsculas/minúsculas)
    List<Produto> findAllByNomeContainingIgnoreCase(String nome);

    // Extra- Busca específica por produtos com preço maior ou igual ao valor informado, do menor para maior
    List<Produto> findByPrecoGreaterThanEqualOrderByPrecoAsc(BigDecimal preco);
}
