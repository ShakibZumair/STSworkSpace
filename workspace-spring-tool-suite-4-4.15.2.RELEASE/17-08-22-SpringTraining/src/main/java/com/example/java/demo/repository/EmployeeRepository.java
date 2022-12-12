package com.example.java.demo.repository;

import java.util.List;

import com.example.java.demo.model.Employee;

public interface EmployeeRepository {

	List <Employee> getAllEmployees();
	List <Employee> getEmployeeGreaterThan(int age);
	public Employee getEmployeeById(int id);
	public int insertEmployee(Employee emp);
	public int getDeleteEmployee(int id);
}