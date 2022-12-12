package com.example.demo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.example.demo.model.Product;

public class ProductMapper implements RowMapper<Product> {

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {

		System.out.println("rowMapper...");
		
		Product p1 = new Product();
		p1.setProductId(rs.getInt("product_Id"));
		p1.setCategery(rs.getString("categery"));
		p1.setDescription(rs.getString("description"));
		p1.setManufacture(rs.getString("manufacturer"));
		p1.setUnitPrice(rs.getInt("unit_price"));
		p1.setName(rs.getString("name"));
		
		System.out.println(p1);
		
		return p1;
	}

}
