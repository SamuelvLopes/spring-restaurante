package br.com.pratics.dudulanches.models.ententies;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;


@Entity
public class PaymentMethod {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	@NotBlank
	public String name;
	@Min(0)
	public int active;
	
    public PaymentMethod() {
		
	}
    public PaymentMethod(@NotBlank String name, @Min(0) int active) {
		super();
		this.name = name;
		this.active = active;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getActive() {
		return active;
	}

	public void setActive(int active) {
		this.active = active;
	}
    
    
}
