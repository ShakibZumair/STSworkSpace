package com.example.demo.repository;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.example.demo.exception.ProductNotFoundException;
import com.example.demo.mapper.ProductMapper;
import com.example.demo.model.Product;
@Repository
public class ProductRepositoryimpl implements ProductRepository {
	@Autowired
	JdbcTemplate jdbctemplate;

	@Override
	public List<Product> getAllProduct() {

		String sql = "select * from product";
		System.out.println(sql);
		return jdbctemplate.query(sql, new ProductMapper());
	}

	@SuppressWarnings("deprecation")
	@Override
	public Product getProductById(String productId) throws ProductNotFoundException {
		// TODO Auto-generated method stub
		String sql = "select * from product where product_id=?";
		try {
	       return jdbctemplate.queryForObject(sql, new Object[] {productId}, new ProductMapper());
		}catch(DataAccessException ex) {
			throw new ProductNotFoundException (productId,"product with id does not exist");
		}
		
	}
//	@SuppressWarnings("deprecation")
//	@Override
//	public Product getProductById(String productId) throws ProductNotFoundException {
//		// TODO Auto-generated method stub
//		String sql = "select * from product where product_id=?";
//		
//	     Product product= jdbctemplate.queryForObject(sql, new Object[] {productId}, new ProductMapper());
//		if(product==null)
//			throw new ProductNotFoundException (productId,"product with id does not exist");
//		return product;
//		}
		
	}
//	@Override
//	public Product getProductById(String productId) {
//		// TODO Auto-generated method stub
//		String sql = "select * from product where product_id=?";
//	       return jdbctemplate.queryForObject(sql, new Object[] {productId}, new ProductMapper());
//	}








}
	



