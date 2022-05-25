package com.papelariauniversal.pedidovenda.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class CadastroClienteBean {

	private List<Integer> endereco;
	
	public CadastroClienteBean() {
		endereco = new ArrayList<>();
		endereco.add(1);
	}

	public List<Integer> getEndereco() {
		return endereco;
	}
	
}