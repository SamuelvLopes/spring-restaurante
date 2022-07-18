package br.com.pratics.dudulanches.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import br.com.pratics.dudulanches.models.ententies.Auth;
import br.com.pratics.dudulanches.models.ententies.Cliente;
import br.com.pratics.dudulanches.models.ententies.HashUtils;
import br.com.pratics.dudulanches.models.repo.AuthRepo;
import br.com.pratics.dudulanches.models.repo.ClienteRepo;

@RestController
@RequestMapping("/api/clientes")
public class ClienteControler {
	
	@Autowired
	private ClienteRepo ClienteRepo;
	@Autowired
	private AuthRepo AuthRepo;
	
	
	@RequestMapping(method = { RequestMethod.POST, RequestMethod.PUT })
	public Cliente newCliente(@Valid Cliente cliente) {	
		ClienteRepo.save(cliente);
		return cliente;
	}
	
	@GetMapping("/{id}")
	public Optional<Cliente> recuperar(@PathVariable int id) {
		return ClienteRepo.findById(id);
	}
	
	@GetMapping
	public Iterable<Cliente> ListarClientes(){
		return ClienteRepo.findAll();
	}
	@PutMapping("/{id}/{type}")
	public Boolean promover(@PathVariable int id,@PathVariable int type) {
		
		Optional<Cliente> retorno = ClienteRepo.findById(id);
		if(retorno.isPresent()) {
			Cliente cliente = retorno.get();
			cliente.setType(type);
			ClienteRepo.save(cliente);
			return true;
			
		}
		return false;
		
	}
	@PostMapping("/logar")
	public Auth logar(
			@RequestParam String email,
			@RequestParam String password
			 ){
			Iterable<Cliente> clientes = ClienteRepo.findByEmailEquals(email);
			for(Cliente cliente:clientes) {
				
				if(password.equals(cliente.password)) {
					long unixTime = System.currentTimeMillis() / 1000L;
					System.out.print(HashUtils.getHashMd5(unixTime+" "+cliente.id));
					Auth auth= new Auth(
							cliente.id,
							HashUtils.getHashMd5(unixTime+" "+cliente.id),
							Long.toString(unixTime+86400),
							cliente.type);
					AuthRepo.save(auth);
					return auth;
					
				}
				//return cliente;
				
			}
			return null;
	}
	
	
	
	
}
