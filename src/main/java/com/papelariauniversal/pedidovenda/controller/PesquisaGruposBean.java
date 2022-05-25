package com.papelariauniversal.pedidovenda.controller;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;

@ManagedBean
@RequestScoped
public class PesquisaGruposBean {

	private List<Integer> gruposFiltrados;
	
	public PesquisaGruposBean() {
		gruposFiltrados = new ArrayList<>();
		for (int i = 0; i < 2; i++) {
			gruposFiltrados.add(i);
		}
	}

	public List<Integer> getgruposFiltrados() {
		return gruposFiltrados;
	}
	
}