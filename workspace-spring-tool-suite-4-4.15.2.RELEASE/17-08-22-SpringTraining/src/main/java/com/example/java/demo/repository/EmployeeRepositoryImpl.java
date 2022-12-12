package com.example.java.demo.repository;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.example.java.demo.model.Employee;
import com.example.java.demo.rowmapper.EmployeeMapper;
@Component
public class EmployeeRepositoryImpl implements EmployeeRepository{
	@Autowired
JdbcTemplate jdbctemplate;

/* First way using RowMapper with all details */
//	@Override
//	public List<Employee> getAllEmployees() {
//		// TODO Auto-generated method stub
//	return jdbctemplate.query("select * from Employee", new RowMapper <Employee>() {
//
//		@Override
//		public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
//			// TODO Auto-generated method stub
//         Employee e=new Employee();
//         e.setAge(rs.getInt("Age"));
//         e.setId(rs.getInt("Id"));
//         e.setName(rs.getString("Name"));
//         e.setMobile(rs.getString("Mobile"));
//			return e;
//		}
//			
//		});
//	
//	}
	
	
	
/*
 * Second way in which we create new class and implements with RowMapper
 * Interface and directly called tothese class;
 */
	@Override
	public List<Employee> getAllEmployees() {
		// TODO Auto-generated method stub
	return jdbctemplate.query("select * from Employee", new EmployeeMapper() {
		
	});
	
	}
	
	
	
	/* First way with RowMapper using here*/
//	@Override
//	public List<Employee> getEmployeeGreaterThan(int age) {
//		// TODO Auto-generated method stub
//		return jdbctemplate.query("select * from Employee where age>?",new PreparedStatementSetter () {
//
//			@Override
//			public void setValues(PreparedStatement ps) throws SQLException {
//				// TODO Auto-generated method stub
//				ps.setInt(1, age);
//			}
//			
//		},new RowMapper <Employee>() {
//
//			@Override
//			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
//				// TODO Auto-generated method stub
//	         Employee e=new Employee();
//	         e.setAge(rs.getInt("Age"));
//	         e.setId(rs.getInt("Id"));
//	         e.setName(rs.getString("Name"));
//	         e.setMobile(rs.getString("Mobile"));
//				return e;
//			}
//				
//			});
	
	

	@Override
	public List<Employee> getEmployeeGreaterThan(int age) {
		// TODO Auto-generated method stub
		return jdbctemplate.query("select * from Employee where age>?",new PreparedStatementSetter () {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				// TODO Auto-generated method stub
				ps.setInt(1, age);
			}
			
		},new EmployeeMapper() {
			
		});
	}



	@SuppressWarnings("deprecation")
	@Override
	public Employee getEmployeeById(int id) {
		String sql="select *from Employee where id=?";
		return jdbctemplate.queryForObject(sql, new Object[] {id},new EmployeeMapper() {
			
		});
		// TODO Auto-generated method stub
		
	}

 

	@Override
	public int insertEmployee(Employee emp) {
		// TODO Auto-generated method stub
		String sql="insert into Employee( age,id,name,mobile) values(?,?,?,?)";
		return jdbctemplate.update(sql, new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				// TODO Auto-generated method stub
			ps.setInt(1, emp.getAge());
			ps.setInt(2, emp.getId());
			ps.setString(3, emp.getName());
			ps.setString(4, emp.getMobile());
			}
			
		});
	}



	@Override
	public int getDeleteEmployee(int id) {
		// TODO Auto-generated method stub
		String sql="Delete from employee where id=?";
		return jdbctemplate.update(sql,new PreparedStatementSetter() {

			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				// TODO Auto-generated method stub
				ps.setInt(1, id);
			}

		
			
		});
	}

}
