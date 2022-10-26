package com.turn2c.turn2c.model;

import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity
@Table(name = "cliente")
public class ClienteModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idCliente;

	@NotNull
	@Size(min = 2, max = 100)
	private String nomeCliente;

	@OneToMany(mappedBy = "cliente")
	Set<ClienteVendedorModel> registration;
	// @ManyToMany(cascade = CascadeType.ALL)
	// @JoinTable(name = "cliente_vendedor",
	// joinColumns = {@JoinColumn(name = "idCliente")},
	// inverseJoinColumns = {@JoinColumn(name = "idVendedor")})
	// private List<VendedorModel> vendedores = new ArrayList<VendedorModel>();

//	public List<VendedorModel> getVendedores() {
	// return vendedores;
	// }

//	public void setVendedores(List<VendedorModel> vendedores) {
//		this.vendedores = vendedores;
	// }

	public long getId() {
		return idCliente;
	}

	public void setId(long id) {
		this.idCliente = id;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}

}
