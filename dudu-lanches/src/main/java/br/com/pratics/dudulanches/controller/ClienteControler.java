package br.com.pratics.dudulanches.controller;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.pratics.dudulanches.models.ententies.Cliente;

@RestController
@RequestMapping("/api/clientes")
public class ClienteControler {
	
	
	@PostMapping
	public Cliente newCliente(@Valid Cliente cliente) {	
		//clienteRepo.save(cliente);
		return cliente;
	}
	
	
}
