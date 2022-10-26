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


import com.turn2c.turn2c.model.VendedorModel;
import com.turn2c.turn2c.repository.VendedorRepository;

@RestController
@RequestMapping ("/vendedor")
@CrossOrigin("*")
public class VendedorController {

	@Autowired
	private VendedorRepository repository;
	
	@GetMapping
	public ResponseEntity<List<VendedorModel>> GetAll(){
		return ResponseEntity.ok(repository.findAll());
	} 
	
	@PostMapping
	public ResponseEntity<VendedorModel> Post(@RequestBody VendedorModel vendedor){
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(vendedor));
	}
	
	@PutMapping
	public ResponseEntity<VendedorModel> Put(@RequestBody VendedorModel vendedor){
		return ResponseEntity.ok().body(repository.save(vendedor));
	}
	
	@DeleteMapping ("/{Id}")
	public void Delete(@PathVariable Long id) {
		repository.deleteById(id);
	}
	
}
