package com.example.demo.controller;

import java.io.File;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.exception.ProductNotFoundException;
import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import com.example.demo.validator.ProductValidator;

@Controller
@RequestMapping("/product")
public class ProductController {

	@Autowired
	ProductService productservice;

	@Autowired
	ProductValidator productValidator;

	@InitBinder
	public void initBinder(WebDataBinder binder) {
		binder.setValidator(productValidator);
	}

	@RequestMapping(method = RequestMethod.GET, value = "/all")
	public String getAllProduct(ModelMap model) {
		List<Product> product = productservice.getAllProduct();
		model.addAttribute("products", product);
		return "allProducts";

	}
//	@RequestMapping(method = RequestMethod.GET, value = "/{category}")
//public String getProductsByCategory(@PathVariable ("category") String category, ModelMap model) {
//		List<Product> product = productservice.getProductByCategory(category);
//		model.addAttribute("products", product);
//		return "allProducts";
//	
//}
//	

	@RequestMapping(method = RequestMethod.GET)
	public String getProductById(@RequestParam("id") String productId, ModelMap model) {
		Product product = productservice.getProductById(productId);
		return "oneProduct";

	}

	@RequestMapping(method = RequestMethod.GET, value = "/add")
	public String displayProductForm(ModelMap model) {
		Product newProduct = new Product();
		model.addAttribute("newProduct", newProduct);
		return "addproduct";

	}

	@RequestMapping(method = RequestMethod.GET, value = "/add")
	public String addProduct(@ModelAttribute("addProduct") Product product, HttpServletRequest request) {
		MultipartFile productimage = product.getProductImage();
		String filepath = request.getSession().getServletContext().getRealPath("/");

		try {
			productimage.transferTo(new File(filepath + "resources\\images\\" + product.getProductId() + ".png"));
		} catch (Exception ex) {
		}
		// productservice.add
		return null;

	}

	@ExceptionHandler(ProductNotFoundException.class)
	public ModelAndView productNotFound(ProductNotFoundException ex, HttpServletRequest request) {
		ModelAndView mv = new ModelAndView();
		mv.addObject("invalidProductId", ex.getProductId());
		mv.addObject("message", ex.getMessage());
		mv.addObject("url", request.getRequestURL() + "?" + request.getQueryString());
		mv.setViewName("productNotFound");
		return mv;

	}
}
