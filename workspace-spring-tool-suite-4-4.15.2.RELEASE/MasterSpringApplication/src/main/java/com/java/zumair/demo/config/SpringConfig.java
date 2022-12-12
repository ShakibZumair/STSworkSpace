package com.java.zumair.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import com.java.zumair.demo.model.Car;

@Configuration
@ComponentScan(basePackages=("com.java.zumair.demo.model,com.java.zumair.demo.repository"))
public class SpringConfig {

	@Bean("maruti")
	public Car myCar() {
		return new Car(1,"Ertiga","Maruti");
	}
	@Bean ("honda")
	public Car myByCar() {
		return new Car(2,"HondaCity","honda");
		
	}
}
