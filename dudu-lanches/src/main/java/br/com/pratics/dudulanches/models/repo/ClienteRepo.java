package br.com.pratics.dudulanches.models.repo;

import org.springframework.data.repository.CrudRepository;

import br.com.pratics.dudulanches.models.ententies.Cliente;

public interface ClienteRepo extends CrudRepository<Cliente, Integer> {

	
	public Iterable<Cliente> findByEmailEquals(String Email);
	
}
