package com.hsbc.productfactory;

import com.hsbc.entities.Apparel;
import com.hsbc.entities.Electronic;
import com.hsbc.entities.FoodItem;
import com.hsbc.entities.Product;
import com.hsbc.producttype.ProductType;
import com.hsbc.exceptions.ProductTypeNotFoundException;

public class ProductFactory {
	
	private ProductFactory() {}
	
	public static Product makeProduct(ProductType productType, int productId, String productName, double productUnitPrice, int quantity) throws ProductTypeNotFoundException {
		Product product = null;
		
		switch (productType) {
		case FOODITEM: {
			product = new FoodItem(productId, productName, productUnitPrice, quantity);
			break;
		}
		case APPAREL: {
			product = new Apparel(productId, productName, productUnitPrice, quantity);
			break;
		}
		case ELECTRONIC: {
			product = new Electronic(productId, productName, productUnitPrice, quantity);
			break;
		}
		default:
			throw new ProductTypeNotFoundException("Invalid Product Type");
		}
		return product;
	}
}
