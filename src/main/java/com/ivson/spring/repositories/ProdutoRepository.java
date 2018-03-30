package com.ivson.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ivson.spring.domain.Produto;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {

}
