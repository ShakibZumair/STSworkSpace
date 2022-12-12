package com.java.zumair.demo.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.java.zumair.demo.model.Product;
import com.java.zumair.demo.repository.ProductListRepo;

@Service
public class ProductServiceImpl implements ProductService{
	@Autowired
	ProductListRepo productrepo;

	@Override
	public List<Product> getAllProduct() {
		// TODO Auto-generated method stub
		return productrepo.getAllProduct();
	}

	@Override
    public List<Product> getProductByCategory(String category) {



//        case-1
//        return    productRepo.getProductByCategory(category);
        
//        case-2
        return productrepo.getAllProduct().stream().filter(p->p.getCategory().equals(category)).collect(Collectors.toList());
    }



   
    @Override
    public Product getProductById(String productId) {
        
     //   System.out.println("service....call");
        return productrepo.getProductbyId(productId);
    }

	@Override
	public void addProduct(Product prod) {
		// TODO Auto-generated method stub
		 productrepo.addProduct(prod);
	}
}
