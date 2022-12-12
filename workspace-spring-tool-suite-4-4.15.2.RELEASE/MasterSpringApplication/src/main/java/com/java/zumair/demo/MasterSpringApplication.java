package com.java.zumair.demo;

import javax.swing.Spring;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.java.zumair.demo.config.SpringConfig;
import com.java.zumair.demo.model.Car;
import com.java.zumair.demo.model.Employee;

@SpringBootApplication
public class MasterSpringApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(MasterSpringApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		//Car c= new Car(1,"Ertiga","Maruti");
		//System.out.println(c);
		ApplicationContext context= new AnnotationConfigApplicationContext(SpringConfig.class);
		//Car c1=context.getBean(Car.class);
		Car c1=(Car)context.getBean("honda");
		Car c2=(Car)context.getBean("maruti");
		System.out.println(c1);
		System.out.println(c2);
		Employee e=context.getBean(Employee.class);
		e.getDog().bark();
		System.out.println(e);
	
//		Car e1=(Car)context.getBean("honda");
//		System.out.println(e1);
		
		
	}
	

}
