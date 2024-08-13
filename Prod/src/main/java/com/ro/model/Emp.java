package com.ro.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "emp")
public class Emp {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer id;
	//private int id;
	private String name;
	private String email;
	private String number;
	private String product;
	
	public Emp() {
    }
	
	
	
	
	public Emp(int id, String name, String email, String number, String product) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.number = number;
		this.product = product;
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
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public String getProduct() {
		return product;
	}
	public void setProduct(String product) {
		this.product = product;
	}




	@Override
	public String toString() {
		return "Emp [id=" + id + ", name=" + name + ", email=" + email + ", number=" + number + ", product=" + product
				+ "]";
	}
	
	
	

}
