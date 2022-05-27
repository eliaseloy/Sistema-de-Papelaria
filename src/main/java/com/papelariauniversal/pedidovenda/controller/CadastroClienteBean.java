package com.papelariauniversal.pedidovenda.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import com.papelariauniversal.pedidovenda.model.Cliente;

@Named
@ViewScoped
public class CadastroClienteBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Cliente cliente;
	
	private List<Integer> enderecos;

	public CadastroClienteBean() {
		cliente = new Cliente();
		enderecos = new ArrayList<>();
		enderecos.add(1);
	}
	
	public void salvar() {
	}

	public List<Integer> getEnderecos() {
		return enderecos;
	}

	public Cliente getCliente() {
		return cliente;
	}

}
