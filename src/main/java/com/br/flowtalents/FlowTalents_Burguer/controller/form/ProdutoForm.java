package com.br.flowtalents.FlowTalents_Burguer.controller.form;

import com.br.flowtalents.FlowTalents_Burguer.modelo.Produto;

public class ProdutoForm {
	private String nome;
	private String descricao;
	private double preco;
	private int categoria_id;
	
	public ProdutoForm(Produto produto) {
		super();
		this.nome = produto.getNome();
		this.descricao = produto.getDescricao();
		this.preco = produto.getPreco();
		this.categoria_id = produto.getCategoria_id();
	}
	
	public String getNome() {
		return nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public double getPreco() {
		return preco;
	}
	public int getCategoria_id() {
		return categoria_id;
	}
	
	public Produto converter() {
		Produto produto = new Produto(nome, descricao, preco, categoria_id);
		return produto;
	}
	
	
	
}
