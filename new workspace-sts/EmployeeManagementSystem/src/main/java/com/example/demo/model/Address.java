package com.example.demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Address {
	private String permanentAddress;
	private String correspondingAddress;
	private String city;
	private int pincode;
	private String state;
	private String country;
}
