package com.example.java.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name="PRODUCT")
public class Product {
	@Id
	@Column (name="PRODUCT_ID")
	private int productId;
	private String category;
	private String description;
	private String manufacturer;
	private String name;
	private int unitPrice;

//	public Product() {
//
//	}
//
//	public Product(int productId, String category, String description, String manufacturer, String name,
//			int unitPrice) {
//		super();
//		this.productId = productId;
//		this.category = category;
//		this.description = description;
//		this.manufacturer = manufacturer;
//		this.name = name;
//		this.unitPrice = unitPrice;
//	}
//
//	public int getProductId() {
//		return productId;
//	}
//
//	public void setProductId(int productId) {
//		this.productId = productId;
//	}
//
//	public String getCategory() {
//		return category;
//	}
//
//	public void setCategory(String category) {
//		this.category = category;
//	}
//
//	public String getDescription() {
//		return description;
//	}
//
//	public void setDescription(String description) {
//		this.description = description;
//	}
//
//	public String getManufacturer() {
//		return manufacturer;
//	}
//
//	public void setManufacturer(String manufacturer) {
//		this.manufacturer = manufacturer;
//	}
//
//	public String getName() {
//		return name;
//	}
//
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public int getUnitPrice() {
//		return unitPrice;
//	}
//
//	public void setUnitPrice(int unitPrice) {
//		this.unitPrice = unitPrice;
//	}
//
//	@Override
//	public String toString() {
//		return "Product [productId=" + productId + ", category=" + category + ", description=" + description
//				+ ", manufacturer=" + manufacturer + ", name=" + name + ", unitPrice=" + unitPrice + "]";
//	}

}
