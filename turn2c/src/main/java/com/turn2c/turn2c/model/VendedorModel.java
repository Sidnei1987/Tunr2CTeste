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
@Table(name = "vendedor")
public class VendedorModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long idVendedor;
	
	@NotNull
	@Size(min = 2, max = 100)
	private String nomeVendedor;
	
	@OneToMany(mappedBy = "Vendedor")
	Set<ClienteVendedorModel> registration;
	
	//@ManyToMany(mappedBy = "vendedores", cascade = CascadeType.ALL )
	//private List<ClienteModel> cliente = new ArrayList<ClienteModel>();
	
	//public List<ClienteModel> getCliente() {
	//	return cliente;
	//}

	//public void setCliente(List<ClienteModel> cliente) {
		//this.cliente = cliente;
//	}

	public long getIdVendedor() {
		return idVendedor;
	}

	public void setIdVendedor(long idVendedor) {
		this.idVendedor = idVendedor;
	}

	public String getNomeVendedor() {
		return nomeVendedor;
	}

	public void setNomeVendedor(String nomeVendedor) {
		this.nomeVendedor = nomeVendedor;
	}

	


	
	

}
