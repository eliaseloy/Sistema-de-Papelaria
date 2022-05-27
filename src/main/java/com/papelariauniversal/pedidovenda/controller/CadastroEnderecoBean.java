package com.papelariauniversal.pedidovenda.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

import com.papelariauniversal.pedidovenda.model.Endereco;

@ManagedBean
@ViewScoped
public class CadastroEnderecoBean implements Serializable{

	private static final long serialVersionUID = 1L;
	
	private List<Integer> endereco;
	
	public CadastroEnderecoBean() {
		endereco = new ArrayList<>();
		endereco.add(1);
	}

	public List<Integer> getEndereco() {
		return endereco;
	}
	
}