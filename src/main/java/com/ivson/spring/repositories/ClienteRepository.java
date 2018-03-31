package com.ivson.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ivson.spring.domain.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Integer> {

}
