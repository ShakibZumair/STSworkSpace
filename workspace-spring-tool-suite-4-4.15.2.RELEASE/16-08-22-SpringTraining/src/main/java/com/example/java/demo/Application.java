package com.example.java.demo;


import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.java.demo.configuration.SpringConfig;
import com.example.java.demo.model.User;

@SpringBootApplication
public class Application implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		ApplicationContext context=new AnnotationConfigApplicationContext(SpringConfig.class);
    	User u1=(User) context.getBean("u");
		User u2=(User) context.getBean("u1");

		System.out.println(u1); 
		System.out.println(u2);
	}

}
