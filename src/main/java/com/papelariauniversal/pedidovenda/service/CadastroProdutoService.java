package com.papelariauniversal.pedidovenda.service;

import java.io.Serializable;

import javax.inject.Inject;

import com.papelariauniversal.pedidovenda.model.Produto;
import com.papelariauniversal.pedidovenda.repository.Produtos;
import com.papelariauniversal.pedidovenda.util.jpa.Transactional;

public class CadastroProdutoService implements Serializable {

	private static final long serialVersionUID = 1L;

	@Inject
	private Produtos produtos;
	
	@Transactional
	public Produto salvar(Produto produto) {
		Produto produtoExistente = produtos.porSku(produto.getSku());
		
		if (produtoExistente != null) {
			throw new NegocioException("Já existe um produto com o SKU informado.");
		}
		
		return produtos.guardar(produto);
	}
	
}
