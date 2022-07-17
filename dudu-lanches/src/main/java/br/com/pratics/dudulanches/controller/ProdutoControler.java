package br.com.pratics.dudulanches.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;


import br.com.pratics.dudulanches.models.ententies.Produto;
import br.com.pratics.dudulanches.models.repo.produtoRepo;

@RestController
@RequestMapping("/api/produtos")
public class ProdutoControler {
	
	
	@Autowired
	private produtoRepo produtoRepo;

	
	@RequestMapping(method = { RequestMethod.POST, RequestMethod.PUT })
	public @ResponseBody Produto novoproduto(@Valid Produto produto) {
		
		produtoRepo.save(produto);
		return produto;
		
	}

	
	@GetMapping
	public Iterable<Produto> obterProduto() {
		
		return produtoRepo.findAll();
	}

	
	@GetMapping("/{id}")
	public Optional<Produto> obterProduto(@PathVariable int id) {

		return produtoRepo.findById(id);

	}
	
	@DeleteMapping("/{id}")
	public Boolean deletarproduto(@PathVariable int id) {

		
		Optional<Produto> retorno = produtoRepo.findById(id);
		if(retorno.isPresent()) {
			Produto produto = retorno.get();
			produto.setActive(0);
			produtoRepo.save(produto);
			return true;
		}
		return false;
		
		
	}
	
	
	
}
