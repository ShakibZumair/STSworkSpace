package com.java.zumair.demo.model;

import org.springframework.stereotype.Component;

@Component ("labrador")
public class Labrador implements Dog {

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("Bhow Bhow");
		
	}

}
