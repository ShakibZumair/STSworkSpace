package com.java.zumair.demo.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table
public class Product {
	  @Id
	    @Column(name="PRODUCTID")
	    private String productId;
	    
	    @Column(name="NAME")
	    private String name;
	    
	    @Column(name="UNIT_PRICE")
	    private int unitPrice;
	    
	    @Column(name="CATEGORY")
	    private String category;
	    
	    @Column(name="DESCRIPTION")
	    private String description;
	    
	    @Column(name="MANUFACTURER")
	    private String manufacturer;

		public String getProductId() {
			return productId;
		}

		public void setProductId(String productId) {
			this.productId = productId;
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

		public String getCategory() {
			return category;
		}

		public void setCategory(String category) {
			this.category = category;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getManufacturer() {
			return manufacturer;
		}

		public void setManufacturer(String manufacturer) {
			this.manufacturer = manufacturer;
		}

		@Override
		public String toString() {
			return "Product [productId=" + productId + ", name=" + name + ", unitPrice=" + unitPrice + ", category="
					+ category + ", description=" + description + ", manufacturer=" + manufacturer + "]";
		}
	    
		
	    
}
