package com.java.zumair.demo.model;

import org.springframework.stereotype.Component;

@Component
public class SoundSystem {
 private String name="JBl";
 
 public SoundSystem() {
	 
 }

public SoundSystem(String name) {
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
	return "SoundSystem [name=" + name + "]";
}
 
 
}
