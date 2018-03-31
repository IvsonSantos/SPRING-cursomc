package com.ivson.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ivson.spring.domain.Endereco;

public interface EnderecoRepository extends JpaRepository<Endereco, Integer> {

}
