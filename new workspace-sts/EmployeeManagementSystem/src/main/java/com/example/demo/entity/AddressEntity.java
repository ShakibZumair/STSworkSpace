package com.example.demo.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
//@Table(name = "employeee_address")
public class AddressEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long addressId;
	@Column(name = "permanent_address")
	private String permanentAddress;
	@Column(name = "corresponding_address")
	private String correspondingAddress;
	private String city;
	private int pincode;
	private String state;
	private String country;
	
	
}
