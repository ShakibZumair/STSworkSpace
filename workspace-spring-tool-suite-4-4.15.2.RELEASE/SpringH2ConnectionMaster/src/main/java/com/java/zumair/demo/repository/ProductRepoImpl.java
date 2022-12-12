//package com.java.zumair.demo.repository;
//
//import java.util.List;
//
//import javax.persistence.EntityManager;
//import javax.persistence.PersistenceContext;
//
//import org.springframework.stereotype.Repository;
//import org.springframework.transaction.annotation.Transactional;
//
//import com.java.zumair.demo.model.Product;
//
//@Repository("repo1")
//public class ProductRepoImpl implements ProductListRepo {
//
//	@PersistenceContext
//	EntityManager entitymanager;
//	
//	@Override
//	public List<Product> getAllProduct() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	@Override
//	public Product getProductbyId(String id) {
//		// TODO Auto-generated method stub
//		
//		entitymanager.find(Product.class, id);
//		return null;
//	}
//
//	@Transactional
//	@Override
//	public void addProduct(Product prod) {
//		// TODO Auto-generated method stub
//		
//		entitymanager.persist(prod);
//
//	}
//
//	@Override
//	public void deleteProduct(String id) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
//
//
//
//
