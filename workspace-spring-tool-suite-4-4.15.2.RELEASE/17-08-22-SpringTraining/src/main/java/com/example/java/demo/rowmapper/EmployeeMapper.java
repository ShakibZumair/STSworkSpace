package com.example.java.demo.rowmapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.java.demo.model.Employee;

public class EmployeeMapper implements RowMapper<Employee> {
	@Override
	public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Employee e = new Employee();
		e.setAge(rs.getInt("Age"));
		e.setId(rs.getInt("Id"));
		e.setName(rs.getString("Name"));
		e.setMobile(rs.getString("Mobile"));
		return e;
	}

}