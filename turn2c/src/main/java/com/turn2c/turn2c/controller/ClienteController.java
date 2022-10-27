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

import com.turn2c.turn2c.model.ClienteModel;
import com.turn2c.turn2c.repository.ClienteRepository;

@RestController
@RequestMapping("/cliente")
@CrossOrigin("*")
public class ClienteController {

	@Autowired
	private ClienteRepository repository;

	@GetMapping
	public ResponseEntity<List<ClienteModel>> GetAll() {
		return ResponseEntity.ok(repository.findAll());
	}

	@PostMapping
	public ResponseEntity<ClienteModel> Post(@RequestBody ClienteModel cliente) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(cliente));
	}

	@PutMapping
	public ResponseEntity<ClienteModel> Put(@RequestBody ClienteModel cliente) {
		return ResponseEntity.ok().body(repository.save(cliente));
	}

	@DeleteMapping("/{id}")
	public void Delete(@PathVariable Long id) {
		repository.deleteById(id);
	}

}
