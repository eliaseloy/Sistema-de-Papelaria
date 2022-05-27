package com.papelariauniversal.pedidovenda.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ViewScoped;
import javax.inject.Named;

import com.papelariauniversal.pedidovenda.model.Usuario;
import com.papelariauniversal.pedidovenda.model.Grupo;

@Named
@ViewScoped
public class CadastroUsuarioBean implements Serializable {

	private static final long serialVersionUID = 1L;

	private Usuario usuario;
	
	private List<Integer> grupos;

	public CadastroUsuarioBean() {
		usuario = new Usuario();
		grupos = new ArrayList<>();
		grupos.add(1);
	}
	
	public void salvar() {
	}

	public List<Integer> getGrupos() {
		return grupos;
	}

	public Usuario getUsuario() {
		return usuario;
	}

}
