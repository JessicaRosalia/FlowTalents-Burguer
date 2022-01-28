package com.br.flowtalents.FlowTalents_Burguer.controller;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

import com.br.flowtalents.FlowTalents_Burguer.Repository.ProdutoRepository;
import com.br.flowtalents.FlowTalents_Burguer.controller.dto.ProdutoDto;
import com.br.flowtalents.FlowTalents_Burguer.controller.form.ProdutoForm;
import com.br.flowtalents.FlowTalents_Burguer.modelo.Produto;

@RestController
@RequestMapping("/produtos")
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtoRepository;

	@PostMapping
	public ResponseEntity<ProdutoDto> cadastar(@RequestBody ProdutoForm form, UriComponentsBuilder uriBuilder){
		Produto produto = form.converter();
		produtoRepository.save(produto);
		URI uri = uriBuilder.path("/produtos/{id}").buildAndExpand(produto.getId()).toUri();
		return ResponseEntity.created(uri).body(new ProdutoDto(produto));
		
	}
	
	@GetMapping
	public List<ProdutoDto> listar(String nomeProduto){
		if(nomeProduto == null) {
			List<Produto> produtos=produtoRepository.findAll();			
			return ProdutoDto.converter(produtos);
		}else {
			List<Produto> produtos=produtoRepository.findByNome(nomeProduto);			
			return ProdutoDto.converter(produtos);
		}
	}

}
