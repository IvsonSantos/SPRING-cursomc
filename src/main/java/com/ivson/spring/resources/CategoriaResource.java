package com.ivson.spring.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ivson.spring.domain.Categoria;
import com.ivson.spring.services.CategoriaServices;

/**
 * Controlador REST para servir como ENDPOINT, deve buscar do SERVICE
 * @author Santo
 *
 */
@RestController
@RequestMapping(value = "/categorias")  // nome do endopoint REST
public class CategoriaResource {

	@Autowired
	private CategoriaServices service;
	
	/**
	 * ENDPOINT deste método é /categorias/{id}
	 * ResponseEntity = tipo especial para um servico REST, posui codigos HTTP de resposta
	 * @return
	 */
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<Categoria> find(@PathVariable Integer id) {
		
		Categoria categoria = service.buscar(id);		
		return ResponseEntity.ok().body(categoria);
	}
}