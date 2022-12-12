package com.example.java.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.example.java.demo.config.SpringConfig;
import com.example.java.demo.model.Address;
import com.example.java.demo.model.Employee;
import com.example.java.demo.model.User;
import com.example.java.demo.repository.EmployeeRepository;

@SpringBootApplication
@EntityScan (basePackages = "com.example.java.demo.model")

public class Application implements CommandLineRunner {
	@Autowired
    EmployeeRepository er;
	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		/* Previous Example of Autowire, Bean creating */
//		ApplicationContext context= new AnnotationConfigApplicationContext(SpringConfig.class);
//		User u=(User) context.getBean(User.class);
//		Address a=context.getBean(Address.class);
//		System.out.println(u);
//		System.out.println(a);
//		u.getSound();
//		
		er.getEmployeeGreaterThan(23).stream().forEach(e1->System.out.println("Employees whoose Age is Greater than 23 "+e1));
	 System.out.println(er.getEmployeeById(1));
	 
	 Employee e=new Employee();
	 e.setAge(27);e.setId(7);e.setName("Zumair");e.setMobile("896909877");;
	 er.insertEmployee(e);
		System.out.println(er.getDeleteEmployee(1));
		er.getAllEmployees().stream().forEach(e2->System.out.println(e2));


	}

}
