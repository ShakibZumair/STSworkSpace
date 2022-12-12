package com.java.zumair.demo.mapper;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import com.java.zumair.demo.model.Product;



public class ProductMapper implements RowMapper<Product> {

	@Override
	public Product mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		
		
		Product product = new Product();
		product.setProductId(rs.getString("PRODUCTID"));
		product.setName(rs.getString("NAME"));
		product.setDescription(rs.getString("DESCRIPTION"));
		product.setManufacturer(rs.getString("MANUFACTURER"));
		product.setCategory(rs.getString("CATEGORY"));
		product.setUnitPrice(rs.getInt("UNIT_PRICE"));
		return product;


	}

}