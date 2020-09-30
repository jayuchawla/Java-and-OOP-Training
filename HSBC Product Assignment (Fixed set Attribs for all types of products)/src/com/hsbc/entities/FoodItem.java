package com.hsbc.entities;

import java.util.Date;

import com.hsbc.producttype.ProductType;

public class FoodItem extends Product{
	
//	public static final boolean DEFAULT_VEGETARIAN = true;
//	
//	private Date dateOfManufacture;
//	private Date dateOfExpiry;
//	private boolean Vegetarian;

	/*public FoodItem() {
		
	}*/
	
	/*public FoodItem(int productId, String productName, double productUnitPrice, int quantity, Date dateOfManufacture, Date dateOfExpiry) {
		this(productId, productName, productUnitPrice, quantity, dateOfManufacture, dateOfExpiry, DEFAULT_VEGETARIAN);
	}*/

	public FoodItem(int productId, String productName, double productUnitPrice, int quantity) {
		super(ProductType.FOODITEM, productId, productName, productUnitPrice, quantity);
//		this.dateOfManufacture = dateOfManufacture;
//		this.dateOfExpiry = dateOfExpiry;
//		Vegetarian = vegetarian;
	}

	/*@Override
	public String toString() {
		return  super.toString() + "FoodItem [dateOfManufacture=" + dateOfManufacture + ", dateOfExpiry=" + dateOfExpiry + ", Vegetarian="
				+ Vegetarian + ", toString()=" + "]";*/
}
