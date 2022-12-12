package com.example.java.demo.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.example.java.demo.model.User;

@Configuration
public class SpringConfig {

	@Bean ("u")
	public User getUser() {
		
		return new User();
		
	}
	@Bean ("u1")
	public User getUser1() {
		User u= new User();
		u.setId(2);
		u.setName("Shakib");
		u.setEmail("shakib@gmail.com");
		return u;
	}
}
