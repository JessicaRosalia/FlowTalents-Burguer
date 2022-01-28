package com.br.flowtalents.FlowTalents_Burguer.Repository;
import com.br.flowtalents.FlowTalents_Burguer.modelo.Produto;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ProdutoRepository extends JpaRepository<Produto, Long>{

	List<Produto> findByNome(String nomeProduto);
}
