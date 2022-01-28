package com.br.flowtalents.FlowTalents_Burguer.modelo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Produto {
	
	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nome;
	private String descricao;
	private double preco;
	private int categoria_id;
	
	public Produto() {

	}

	public Produto(String nome, String descricao, double preco, int categoria_id) {
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.categoria_id = categoria_id;
	}

	public Long getId() {
		return id;
	}
	
	public void setId(Long id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public double getPreco() {
		return preco;
	}
	
	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	public int getCategoria_id() {
		return categoria_id;
	}
	
	public void setCategoria_id(int categoria_id) {
		this.categoria_id = categoria_id;
	}
	
	
}
