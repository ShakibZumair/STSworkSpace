package com.example.java.demo.model;

import org.springframework.stereotype.Component;

@Component ("lab")
public class Labrador implements Dog {

	@Override
	public void bar() {
		// TODO Auto-generated method stub
		System.out.println("bhow bhow");
	}

}
