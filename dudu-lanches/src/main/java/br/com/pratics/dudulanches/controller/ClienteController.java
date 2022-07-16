package br.com.pratics.dudulanches.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.pratics.dudulanches.models.Cliente;
@RestController
@RequestMapping(path="/clientes")
public class ClienteController {
	
	@GetMapping(path="/qualquer")
	public Cliente obterCliente() {
		
		return new Cliente(1,"Pedro","123.456.78-90");
		
	}
	@GetMapping("/{id}")
	public Cliente obterClientePorid(@PathVariable int id){
		
		return new Cliente(id,"maria","124.343.122-11");
	}
	@GetMapping
	public Cliente obterClientePorid2(
			@RequestParam(name="id",defaultValue="1") int id
			) {
		
		return new Cliente(id,"joao","124.343.122-11");
		}
		
		
	
	

}
