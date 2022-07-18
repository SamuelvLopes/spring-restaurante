package br.com.pratics.dudulanches.controller;

import java.util.Optional;

import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.pratics.dudulanches.models.ententies.PaymentMethod;
import br.com.pratics.dudulanches.models.repo.paymenthRepo;

@RestController
@RequestMapping("/api/paymenth/method")
public class PayMethod {
	
	
	@Autowired
	private paymenthRepo paymenthRepo;
	
	@RequestMapping(method = { RequestMethod.POST, RequestMethod.PUT })
	public PaymentMethod newPaymethod(@Valid PaymentMethod payment){
		paymenthRepo.save(payment);
		return payment;
	}
	
	@GetMapping
	public Iterable<PaymentMethod> ListAllPaymenthod(){
		return paymenthRepo.findAll();
	}
	@GetMapping("/{id}")
	public Optional<PaymentMethod> FindPaymentMethod(@PathVariable int id){
		return paymenthRepo.findById(id);
	}
	@DeleteMapping("/{id}")
	public Boolean DeletePaymentMethod(@PathVariable int id){
		
		Optional<PaymentMethod> retorno = paymenthRepo.findById(id);
		if(retorno.isPresent()) {
			PaymentMethod payment = retorno.get();
			payment.setActive(0);
			paymenthRepo.save(payment);
			return true;
			
		}
		return false;
	}
	
}
