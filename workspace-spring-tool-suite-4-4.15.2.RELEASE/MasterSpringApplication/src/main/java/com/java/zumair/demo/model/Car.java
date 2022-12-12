package com.java.zumair.demo.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Car {
	private int id;
	private String name;
	private String brand;
	@Autowired
	AirConditioner ac;
	@Autowired
	SoundSystem ss;

public Car() {
	
}

	public Car(int id, String name, String brand) {
		super();
		this.id = id;
		this.name = name;
		this.brand = brand;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public AirConditioner getAc() {
		return ac;
	}

	public void setAc(AirConditioner ac) {
		this.ac = ac;
	}

	public SoundSystem getSs() {
		return ss;
	}

	public void setSs(SoundSystem ss) {
		this.ss = ss;
	}

	@Override
	public String toString() {
		return "Car [id=" + id + ", name=" + name + ", brand=" + brand + ", ac=" + ac + ", ss=" + ss + "]";
	}



}
