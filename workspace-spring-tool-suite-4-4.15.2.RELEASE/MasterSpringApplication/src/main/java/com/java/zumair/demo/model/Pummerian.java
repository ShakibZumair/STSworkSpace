package com.java.zumair.demo.model;

import org.springframework.stereotype.Component;

@Component ("pummerian")
public class Pummerian implements Dog{

	@Override
	public void bark() {
		// TODO Auto-generated method stub
		System.out.println("whoof whoof");
	}

}
