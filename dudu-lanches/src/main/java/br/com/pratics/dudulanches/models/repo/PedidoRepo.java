package br.com.pratics.dudulanches.models.repo;

import org.springframework.data.repository.CrudRepository;

import br.com.pratics.dudulanches.models.ententies.Pedido;

public interface PedidoRepo extends CrudRepository<Pedido, Integer>{

	public Iterable<Pedido> findByIdclienteEquals(int Id);
}
