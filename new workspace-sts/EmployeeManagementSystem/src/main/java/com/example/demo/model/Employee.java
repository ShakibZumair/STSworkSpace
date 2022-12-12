package com.example.demo.model;

import javax.persistence.CascadeType;
import javax.persistence.OneToOne;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.demo.entity.AddressEntity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {

	private long id;
	private String firstName;
	private String lastName;
	private String middleName;
	private String emailId;
	private String mobileNumber;
	private String password;
	
	private String currentRole;
	private String lastOrganization;
	private String emergencyContactNumber;
	private float currentCTC;
	private float yearOfExperience;
	private float salary;
	
	//@OneToOne(targetEntity = Address.class, cascade = CascadeType.ALL)
	
	@Autowired
	Address address;
}
