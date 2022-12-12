package com.example.java.demo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.java.demo.model.Product;

public class ProductMapper implements RowMapper<Product>{

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Product p=new Product();
		p.setName(rs.getString("name"));
		p.setProductId(rs.getInt("product_id"));
		p.setCategory(rs.getString("category"));
		p.setManufacturer(rs.getString("manufacturer"));
		p.setUnitPrice(rs.getInt("unit_Price"));
		p.setDescription(rs.getString("description"));
		
		return p;
	}

}
