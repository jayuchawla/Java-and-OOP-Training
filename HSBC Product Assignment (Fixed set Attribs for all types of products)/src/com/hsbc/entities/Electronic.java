package com.hsbc.entities;

import com.hsbc.producttype.ProductType;

public class Electronic extends Product{
	
	//public static final int DEFAULT_WARRANTY = 12;
	
	//private int warranty;
	
	/*public Electronic() {
		// TODO Auto-generated constructor stub
	}*/
	
	/*public Electronic(int productId, String productName, double productUnitPrice, int quantity) {
		this(productId, productName, productUnitPrice, quantity, DEFAULT_WARRANTY);
	}*/
	
	public Electronic(int productId, String productName, double productUnitPrice, int quantity) {
		super(ProductType.ELECTRONIC, productId, productName, productUnitPrice, quantity);
	}

	@Override
	public String toString() {
		return super.toString() + "Electronic";
	}
	
	
}
