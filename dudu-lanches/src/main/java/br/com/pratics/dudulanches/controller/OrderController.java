package br.com.pratics.dudulanches.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pratics.dudulanches.models.ententies.Pedido;
import br.com.pratics.dudulanches.models.repo.PedidoRepo;
@RestController
@RequestMapping("api/order")
public class OrderController {
	@Autowired
	private PedidoRepo PedidoRepo;
	
	@GetMapping("/{id}")
	public Iterable<Pedido> RecuperarPedidosCliente(@PathVariable int id){
		return PedidoRepo.findByIdclienteEquals(id);
	}
	@GetMapping
	public Iterable<Pedido> RecuperarPedidos(){
		return PedidoRepo.findAll();
	}
	@PostMapping
	public Pedido ConstruirPedido(Pedido order){
		PedidoRepo.save(order);
		return order;
	}
	
}
