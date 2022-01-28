package com.br.flowtalents.FlowTalents_Burguer.controller.dto;

import java.util.ArrayList;
import java.util.List;

import com.br.flowtalents.FlowTalents_Burguer.modelo.Produto;

public class ProdutoDto {
	private String nome;
	private String descricao;
	private double preco;
	
	public ProdutoDto(Produto produto) {
		this.descricao = produto.getDescricao();
		this.nome = produto.getNome();
		this.preco = produto.getPreco();
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



	public static List<ProdutoDto> converter(List<Produto> produtos) {
		List<ProdutoDto> listProdutosDto = new ArrayList<ProdutoDto>();
		for(int i=0; i < produtos.size(); i++) {
			ProdutoDto tdto = new ProdutoDto(produtos.get(i));
			listProdutosDto.add(tdto);
		}
		
		return listProdutosDto;
	}
	
}
