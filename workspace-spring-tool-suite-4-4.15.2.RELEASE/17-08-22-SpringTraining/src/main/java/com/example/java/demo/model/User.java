package com.example.java.demo.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class User {
	private String name;
	private String email;
	private int id;
	@Autowired
	private Address address;
	@Autowired
	@Qualifier ("pum")
	private Dog dog;
	public User() {
		this.id = 1;
		this.name = "zumair";
		this.email = "zumair@gmail.com";

	}
	public void getSound() {
		this.dog.bar();
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

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Dog getDog() {
		return dog;
	}
	public void setDog(Dog dog) {
		this.dog = dog;
	}
	@Override
	public String toString() {
		return "User [name=" + name + ", email=" + email + ", id=" + id + ", address=" + address + "]";
	}
	
	
}
