package com.java.zumair.demo.model;

public class User {

	private int id;
	private String name;
	private String department;
	private int age;
	private String password;

	public User() {

	}

	public User(int id, String name, String department, int age, String password) {
		super();
		this.id = id;
		this.name = name;
		this.department = department;
		this.age = age;
		this.password = password;
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

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", name=" + name + ", department=" + department + ", age=" + age + ", password="
				+ password + "]";
	}

	
}
