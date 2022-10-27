package com.turn2c.turn2c.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.turn2c.turn2c.model.ClienteVendedorModel;

import com.turn2c.turn2c.repository.ClienteVendedorRepository;

@RestController
@RequestMapping("/cliente_vendedor")
@CrossOrigin("*")
public class ClienteVendedorController {

	@Autowired
	private ClienteVendedorRepository repository;

	@GetMapping
	public ResponseEntity<List<ClienteVendedorModel>> GetAll() {
		return ResponseEntity.ok(repository.findAll());
	}

	@PostMapping
	public ResponseEntity<ClienteVendedorModel> Post(@RequestBody ClienteVendedorModel cliente) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(cliente));
	}

	@PutMapping
	public ResponseEntity<ClienteVendedorModel> Put(@RequestBody ClienteVendedorModel cliente) {
		return ResponseEntity.ok().body(repository.save(cliente));
	}
	
	@DeleteMapping("/{id}")
	public void Delete(@PathVariable Long id) {
		repository.deleteById(id);
	}


}
