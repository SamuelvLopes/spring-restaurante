package br.com.pratics.dudulanches.models.ententies;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
@Entity
public class Pedido {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	public int id;
	
	public Float price;
	
	public String note;

	public int id_cliente;
	public int id_payment_method;
	public int id_status;
	public int item;
	
	public Pedido(){}
	
	
	public Pedido(Float price, String note, int id_cliente, int id_payment_method, int id_status, int item) {
		super();
		this.price = price;
		this.note = note;
		this.id_cliente = id_cliente;
		this.id_payment_method = id_payment_method;
		this.id_status = id_status;
		this.item = item;
	}


	public Float getPrice() {
		return price;
	}

	public void setPrice(Float price) {
		this.price = price;
	}

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	public int getId_cliente() {
		return id_cliente;
	}

	public void setId_cliente(int id_cliente) {
		this.id_cliente = id_cliente;
	}

	public int getId_payment_method() {
		return id_payment_method;
	}

	public void setId_payment_method(int id_payment_method) {
		this.id_payment_method = id_payment_method;
	}

	public int getId_status() {
		return id_status;
	}

	public void setId_status(int id_status) {
		this.id_status = id_status;
	}

	public int getItem() {
		return item;
	}

	public void setItem(int item) {
		this.item = item;
	}

	
}