package br.com.pratics.dudulanches.models.repo;

import org.springframework.data.repository.CrudRepository;
import br.com.pratics.dudulanches.models.ententies.PaymentMethod;


public interface paymenthRepo extends CrudRepository<PaymentMethod, Integer>{

	
	
}
