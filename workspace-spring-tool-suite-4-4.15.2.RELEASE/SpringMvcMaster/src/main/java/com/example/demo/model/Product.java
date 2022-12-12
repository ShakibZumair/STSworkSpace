package com.example.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Transient;

import org.hibernate.annotations.BatchSize;
import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name = "PRODUCT")
public class Product {
	@Id
	@Column(name = "PRODUCT_ID")
	private int productId;
	@Column(name = "CATEGERY")
	private String categery;
	@Column(name = "DESCRIPTION")
	private String description;
//	@Column(name = "NAME")
//	private String name;
	@Column(name = "NAME")
	@Size(min=5 ,max =40 ,message=("spring.form.name.size");
	private String name;
	@Column(name = "UNIT_PRICE")
	private int unitPrice;
	@Column(name = "MANUFACTURER")
	private String manufacture;
	@Transient
	private MultipartFile productImage;

	public Product() {

	}

	public Product(int productId, String categery, String description, String name, int unitPrice, String manufacture) {
		super();
		this.productId = productId;
		this.categery = categery;
		this.description = description;
		this.name = name;
		this.unitPrice = unitPrice;
		this.manufacture = manufacture;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getCategery() {
		return categery;
	}

	public void setCategery(String categery) {
		this.categery = categery;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getUnitPrice() {
		return unitPrice;
	}

	public void setUnitPrice(int unitPrice) {
		this.unitPrice = unitPrice;
	}

	public String getManufacture() {
		return manufacture;
	}

	public void setManufacture(String manufacture) {
		this.manufacture = manufacture;
	}

	public MultipartFile getProductImage() {
		return productImage;
	}

	public void setProductImage(MultipartFile productImage) {
		this.productImage = productImage;
	}

	@Override
	public String toString() {
		return "Product [productId=" + productId + ", categery=" + categery + ", description=" + description + ", name="
				+ name + ", unitPrice=" + unitPrice + ", manufacture=" + manufacture + "]";
	}

}
