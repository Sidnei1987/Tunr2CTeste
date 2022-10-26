package com.turn2c.turn2c.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.turn2c.turn2c.model.VendedorModel;

@Repository
public interface VendedorRepository extends JpaRepository<VendedorModel, Long> {

}
