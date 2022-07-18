package br.com.pratics.dudulanches.models.ententies;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
@Entity
public class Auth {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	public int id_client;
	@NotBlank
	public String bayer;
	@NotBlank
	public String validade;
	@Min(1)
	public int nivel;
	
	
	public Auth() {
		
	}
	

	public Auth(int id_client, @NotBlank String bayer, @NotBlank String validade, @Min(1) int nivel) {
		super();
		this.id_client = id_client;
		this.bayer = bayer;
		this.validade = validade;
		this.nivel = nivel;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public int getId_client() {
		return id_client;
	}


	public void setId_client(int id_client) {
		this.id_client = id_client;
	}


	public String getBayer() {
		return bayer;
	}


	public void setBayer(String bayer) {
		this.bayer = bayer;
	}


	public String getValidade() {
		return validade;
	}


	public void setValidade(String validade) {
		this.validade = validade;
	}


	public int getNivel() {
		return nivel;
	}


	public void setNivel(int nivel) {
		this.nivel = nivel;
	}
	
	
}
