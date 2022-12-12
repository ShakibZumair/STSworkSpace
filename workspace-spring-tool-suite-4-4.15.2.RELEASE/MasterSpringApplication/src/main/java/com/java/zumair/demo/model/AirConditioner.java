package com.java.zumair.demo.model;

import org.springframework.stereotype.Component;

@Component
public class AirConditioner {
 String name="Daikin";
 
 public AirConditioner() {
	 
 }

public AirConditioner(String name) {
	super();
	this.name = name;
}

public String getName() {
	return name;
}

public void setName(String name) {
	this.name = name;
}

@Override
public String toString() {
	return "AirConditioner [name=" + name + "]";
}
 
}
