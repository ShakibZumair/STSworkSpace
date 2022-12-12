package com.java.zumair.demo.model;

import org.springframework.stereotype.Component;

@Component
public class Address {

	private int zip = 411229;
	private String city = "Pune";

	public Address() {

	}

	public Address(int zip, String city) {
		super();
		this.zip = zip;
		this.city = city;
	}

	public int getZip() {
		return zip;
	}

	public void setZip(int zip) {
		this.zip = zip;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	@Override
	public String toString() {
		return "Address [zip=" + zip + ", city=" + city + "]";
	}

}
