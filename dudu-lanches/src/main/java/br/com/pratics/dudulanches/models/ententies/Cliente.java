package br.com.pratics.dudulanches.models.ententies;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
@Entity
public class Cliente {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	
	@NotBlank
	public String name;
	
	@NotBlank
	public String phone;
	
	@NotBlank
	public String email;
	
	@NotBlank
	public String password;
	
	@Min(0)
	public int type;
	public Cliente() {
		
	}
	
	public Cliente(@NotBlank String name, @NotBlank String phone, @NotBlank String email, @NotBlank String password,
			@Min(0) int type) {
		super();
		this.name = name;
		this.phone = phone;
		this.email = email;
		this.password = password;
		this.type = type;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	
}
