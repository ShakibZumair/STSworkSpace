package com.example.java.demo.Repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.java.demo.mapper.ProductMapper;
import com.example.java.demo.model.Product;

@Repository
public class ProductRepoImpl implements ProductRepo {
	@Autowired
	JdbcTemplate jdbctemplate;

	@Override
	public List<Product> getAllProduct() {
		String sql = "select * from product";
		return jdbctemplate.query(sql, new ProductMapper());

	}

}
