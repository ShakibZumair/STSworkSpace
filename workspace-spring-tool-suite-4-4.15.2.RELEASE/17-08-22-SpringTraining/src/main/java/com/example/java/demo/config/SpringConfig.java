package com.example.java.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.example.java.demo.model.Address;
import com.example.java.demo.model.User;

@Configuration
@ComponentScan (basePackages = { "com.example.java.demo.model","com.example.java.demo.controller"})

public class SpringConfig {
	
	/*
	 * User ki bean remove kr ke User class me @Component use kiye phir khud hi bean
	 * gnerate ho ke program work krne laga
	 */
//	@Bean("user")
//	public User getuser() {
//		return new User();
//
//	}

//	@Bean("user1")
//	public User getuser1() {
//		User u1 = new User();
//		u1.setId(2);
//		u1.setName("Amit");
//		u1.setEmail("amit@gmail.com");
//		return u1;
//
//	}
//	@Bean
//	public Address getAddress() {
//		Address address=new Address();
//		address.setCity("yavatmal");
//		address.setZipcode(445001);
//		return address;
//	}
}
