package br.com.pratics.dudulanches.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PrimeiroController {
     
	@GetMapping(path= {"/oloco","/domingão"})
	public String faustao() {
		
		return "faustao";
		
	}
	@RequestMapping(method = RequestMethod.GET, path="/ola")
	public String ola() {
		
		return "banana";
		
	}
	@RequestMapping(method = RequestMethod.GET)
	public String CU() {
		
		return "cu";
		
	}
}
