package com.hsbc.entities;

import com.hsbc.producttype.ProductType;

public abstract class Product {
	
	private int productId;
	private String productName;
	private double productUnitPrice;
	private int quantity;
	private ProductType productType;
	
	/*public Product() {
		// TODO Auto-generated constructor stub
	}*/

	public Product(ProductType productType, int productId, String productName, double productUnitPrice, int quantity) {
		this.productType = productType;
		this.productId = productId;
		this.productName = productName;
		this.productUnitPrice = productUnitPrice;
		this.quantity = quantity;
	}


	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productName=" + productName + ", productUnitPrice="
				+ productUnitPrice + ", quantity=" + quantity + ", productType=" + productType + "]";
	}


	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public ProductType getProductType() {
		return productType;
	}

	public void setProductType(ProductType productType) {
		this.productType = productType;
	}

	public int getProductId() {
		return productId;
	}

	public void setProductId(int productId) {
		this.productId = productId;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public double getProductUnitPrice() {
		return productUnitPrice;
	}

	public void setProductUnitPrice(double productUnitPrice) {
		this.productUnitPrice = productUnitPrice;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + productId;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Product other = (Product) obj;
		if (productId != other.productId)
			return false;
		return true;
	}

}
