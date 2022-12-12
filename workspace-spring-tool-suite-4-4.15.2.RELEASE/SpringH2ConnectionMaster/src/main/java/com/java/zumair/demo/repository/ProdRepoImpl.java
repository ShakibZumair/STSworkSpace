package com.java.zumair.demo.repository;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.PreparedStatementSetter;
import org.springframework.stereotype.Repository;

import com.java.zumair.demo.mapper.ProductMapper;
import com.java.zumair.demo.model.Product;


@Repository
public class ProdRepoImpl implements ProductListRepo {

	@Autowired
	JdbcTemplate temp;
	
	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		
		String sql = "select * from Product";
		return  temp.query(sql, new ProductMapper());
		
	}

	@SuppressWarnings("deprecation")
	@Override
	public Product getProductbyId(String id) {
		// TODO Auto-generated method stub
		
		 String sql ="select * from product where productid=?";
		 return temp.queryForObject(sql, new Object[] {id},new ProductMapper());
		
	}

	@Override
	public void addProduct(Product prod) {
		// TODO Auto-generated method stub
		
		String sql="insert into product(productid , name , category , description , manufacturer , unit_price) values(?, ?, ?,?,?,?);";
		temp.update(sql, new PreparedStatementSetter() {
			
			@Override
			public void setValues(PreparedStatement ps) throws SQLException {
				// TODO Auto-generated method stub
				ps.setString(1, prod.getProductId());
				ps.setString(2, prod.getName());
				ps.setString(3, prod.getCategory());
				ps.setString(4, prod.getDescription());
				ps.setString(5, prod.getManufacturer());
				ps.setLong(6, prod.getUnitPrice());
			}
		});
		
	}

	@Override
	public void deleteProduct(String id) {
		// TODO Auto-generated method stub
		
		String sql="delete from table where productid=?";
		
		
		
	}

}

