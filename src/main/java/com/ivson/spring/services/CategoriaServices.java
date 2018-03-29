package com.ivson.spring.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ivson.spring.domain.Categoria;
import com.ivson.spring.repositories.CategoriaRepository;

@Service
public class CategoriaServices {

	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {
		
		Optional<Categoria> categoria = repo.findById(id);
		return categoria.orElse(null);
	}
}
