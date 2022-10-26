package com.turn2c.turn2c.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "clientes_vendedores")
public class ClienteVendedorModel {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@ManyToOne
	@JoinColumn(name = "idVendedor") // student
	VendedorModel Vendedor;

	@ManyToOne
	@JoinColumn(name = "idCliente") // course
	ClienteModel cliente;

	public VendedorModel getVendedor() {
		return Vendedor;
	}

	public void setVendedor(VendedorModel vendedor) {
		Vendedor = vendedor;
	}

	public ClienteModel getCliente() {
		return cliente;
	}

	public void setCliente(ClienteModel cliente) {
		this.cliente = cliente;
	}
	// public LocalDateTime getRegisteredAt() {
	// return registeredAt;
	// }
	// public void setRegisteredAt(LocalDateTime registeredAt) {
	// this.registeredAt = registeredAt;
///	}
	// LocalDateTime registeredAt;

	// private List<ClienteModel> clientes = new ArrayList<ClienteModel>();

//	private List<VendedorModel> vendedores = new ArrayList<VendedorModel>();

	public long getIdCV() {
		return id;
	}

	public void setIdCV(long idCV) {
		this.id = idCV;
	}
	// public List<ClienteModel> getClientes() {
	// return clientes;
//	}
//	public void setClientes(List<ClienteModel> clientes) {
	// this.clientes = clientes;
//	}
//	public List<VendedorModel> getVendedores() {
//		return vendedores;
//	}
//	public void setVendedores(List<VendedorModel> vendedores) {
	// this.vendedores = vendedores;
	// }

}
