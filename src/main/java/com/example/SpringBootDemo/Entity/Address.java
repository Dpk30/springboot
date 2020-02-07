package com.example.SpringBootDemo.Entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Address {

	@Id
	int pincode;
	String city;
	String country;
	
	public Address() {
		// TODO Auto-generated constructor stub
	}

}
