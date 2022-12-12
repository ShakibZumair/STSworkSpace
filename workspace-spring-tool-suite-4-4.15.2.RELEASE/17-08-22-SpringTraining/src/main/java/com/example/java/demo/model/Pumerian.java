package com.example.java.demo.model;

import org.springframework.stereotype.Component;

@Component ("pum")
public class Pumerian implements Dog {

	@Override
	public void bar() {
		// TODO Auto-generated method stub
		System.out.println("slowly bar pumerian");
	}

}
