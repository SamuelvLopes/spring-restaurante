package br.com.pratics.dudulanches.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pratics.dudulanches.models.ententies.Pedido;
@RestController
@RequestMapping("api/order")
public class OrderController {
	
	@PostMapping
	public Pedido ConstruirPedido(Pedido order){
		return order;
	}
	
}
