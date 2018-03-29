package com.ivson.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ivson.spring.domain.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Integer> {

}
