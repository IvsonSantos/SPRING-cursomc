package com.ivson.spring.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ivson.spring.domain.Cliente;
import com.ivson.spring.services.ClienteService;

@RestController
@RequestMapping(value = "/clientes")  // nome do endopoint REST
public class ClienteResource {

	@Autowired
	private ClienteService service;
	
	/**
	 * ENDPOINT deste método é /clientes/{id}
	 * ResponseEntity = tipo especial para um servico REST, posui codigos HTTP de resposta
	 * @return
	 */
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<Cliente> find(@PathVariable Integer id) {
		
		Cliente cliente = service.find(id);		
		return ResponseEntity.ok().body(cliente);
	}
}
