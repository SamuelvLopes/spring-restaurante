package br.com.pratics.dudulanches.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/metodos")
public class metodos {

	@GetMapping
	public String get(){
		return"get";
	}
	@PostMapping
	public String post(){
		return "post";
	}
	@PutMapping
	public String put(){
		return "PUT";
	}
	@PatchMapping
	public  String patch(){
		return"patch";
	}
	@DeleteMapping
	public 	String delete() {
		return "delete";
	}
}
