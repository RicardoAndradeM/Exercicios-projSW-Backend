package com.ricardo.studySpring.entities;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class Product {

	private @Id @GeneratedValue long codigo;
	private String name;
	private double price;
	
	public Product() { }
	
	public Product(String name, Double price) {
		this.name = name;
		this.price = price;
	}
}
