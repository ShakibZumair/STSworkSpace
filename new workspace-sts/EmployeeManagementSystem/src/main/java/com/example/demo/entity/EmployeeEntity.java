package com.example.demo.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonManagedReference;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@AllArgsConstructor
@NoArgsConstructor
@Data

@Entity
@Table(name = "employees")
public class EmployeeEntity {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	long id;
	@Column(name = "first_name")
	private String firstName;
	@Column(name = "last_name")
	private String lastName;
	@Column(name = "middle_name")
	private String middleName;
	@Column(name = "email_id")
	private String emailId;
	@Column(name = "mobile_number")
	private String mobileNumber;

	private String password;

	@Column(name = "current_role")
	private String currentRole;
	@Column(name = "last_organization")
	private String lastOrganization;
	@Column(name = "emergency_contact_number")
	private String emergencyContactNumber;
	private float currentCTC;
	@Column(name = "year_of_experience")
	private float yearOfExperience;
	private float salary;
	

	//@JoinColumn(name="employee_address",referencedColumnName = "id")
	@OneToOne(targetEntity = AddressEntity.class,cascade = CascadeType.ALL)
	
//	@JsonManagedReference
//	@JsonBackReference
	 AddressEntity address;


}
