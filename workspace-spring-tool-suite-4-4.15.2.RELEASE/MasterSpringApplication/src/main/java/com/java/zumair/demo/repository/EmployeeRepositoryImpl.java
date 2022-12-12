package com.java.zumair.demo.repository;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.java.zumair.demo.model.Employee;

@Repository
public class EmployeeRepositoryImpl implements EmployeeRepository {

	Employee e1=new Employee();
	Employee e2=new Employee();
	Employee e3=new Employee();
	List<Employee> emp=Arrays.asList(e1,e2,e3);

	@Override
	public void printAllEmployee() {
		// TODO Auto-generated method stub
		emp.stream().forEach(e->System.out.println(e));
		
	}

}
