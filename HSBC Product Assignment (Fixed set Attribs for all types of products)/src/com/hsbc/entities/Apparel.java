package com.hsbc.entities;

import com.hsbc.producttype.ProductType;

public class Apparel extends Product{
	
//	public static final String DEFAULT_MATERIAL = "cotton";
//	
//	private String size;
//	private String material;
//	private static int numApparels = 0;
	
	/*public Apparel() {
		// TODO Auto-generated constructor stub
	}*/

	/*public Apparel(int productId, String productName, double productUnitPrice, int quantity, String size) {
		this(productId, productName, productUnitPrice, quantity, size, DEFAULT_MATERIAL);
	}*/
	
	public Apparel(int productId, String productName, double productUnitPrice, int quantity) {
		super(ProductType.APPAREL, productId, productName, productUnitPrice, quantity);
//		this.size = size;
//		this.material = material;
	}

	/*@Override
	public String toString() {
		return super.toString() + "Apparel [size=" + size + ", material=" + material + "]";
	}*/

}
