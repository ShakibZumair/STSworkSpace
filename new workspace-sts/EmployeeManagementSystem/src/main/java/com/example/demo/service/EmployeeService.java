package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.EmployeeEntity;
import com.example.demo.model.Employee;

public interface EmployeeService {

	Employee createEmployee (Employee employee);
	List<Employee> getAllEmployee();
//	List<EmployeeEntity> getAllEmployee();

	boolean deleteEmployee(long id);
	EmployeeEntity getEmployeeById (long id);
	Employee updateEmployee(long id, Employee employee );
	public EmployeeEntity loginEmployee(EmployeeEntity employee);

}
