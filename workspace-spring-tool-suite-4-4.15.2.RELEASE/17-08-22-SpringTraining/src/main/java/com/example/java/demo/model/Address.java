package com.example.java.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Address {
private String city;
private int zipcode;

//First Example 
//public Address() {
//	this.city="yavatmal";
//	this.zipcode=445001;
//}

/*
 * Second Example with parameterized Constructor neccesary to create default
 * constructor as well nhi to bean type Configurayion nhi hI AISI ERROR Aayengi
 * Parameterized contructor call hi nhi hota
 */

public Address() {
	this.city="yavatmal";
	this.zipcode=445001;	
}
public Address(String city, int zipcode) {
	super();
	this.city = city;
	this.zipcode =zipcode;
}

public String getCity() {
	return city;
}

public void setCity(String city) {
	this.city = city;
}
public int getZipcode() {
	return zipcode;
}
public void setZipcode(int zipcode) {
	this.zipcode = zipcode;
}
@Override
public String toString() {
	return "Address [city=" + city + ", zipcode=" + zipcode + "]";
}

}
