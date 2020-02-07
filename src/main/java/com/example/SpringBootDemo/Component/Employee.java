package com.example.SpringBootDemo.Component;

import org.springframework.stereotype.Component;

@Component
public class Employee {

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

	int id;
	String name;
	
	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public void print() {
		System.out.println("logger");
		System.out.println("security");
		System.out.println("print");
		System.out.println("transaction");
		System.out.println("logger");
	}
	
}
