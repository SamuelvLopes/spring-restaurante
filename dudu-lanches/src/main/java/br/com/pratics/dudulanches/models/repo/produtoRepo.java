package br.com.pratics.dudulanches.models.repo;

import org.springframework.data.repository.CrudRepository;

import br.com.pratics.dudulanches.models.ententies.Produto;

public interface produtoRepo extends CrudRepository<Produto, Integer>{

	
	
}
