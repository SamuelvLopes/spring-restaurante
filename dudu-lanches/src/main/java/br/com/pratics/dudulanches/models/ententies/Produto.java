package br.com.pratics.dudulanches.models.ententies;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Min;
@Entity
public class Produto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	
	@NotBlank
	public String name;
	
	@NotBlank
	public String description;
	
	@Min(0)
	public double price;
	
	public int active;
	
	public Produto() {
		
	}
	

	public Produto(int id, @NotBlank String name, @NotBlank String description, @Min(0) double price, int active) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.active = active;
	}


	public int getActive() {
		return active;
	}


	public void setActive(int active) {
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

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

}
