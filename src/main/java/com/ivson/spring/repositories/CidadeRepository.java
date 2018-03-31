package com.ivson.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ivson.spring.domain.Cidade;

public interface CidadeRepository extends JpaRepository<Cidade, Integer> {

}
