package com.hsbc.logic;

import java.util.Collections;
import java.util.List;

import com.hsbc.dao.ProductDAOImpl;
import com.hsbc.entities.Product;
import com.hsbc.producttype.ProductType;
import com.hsbc.sortutil.SortProductTypeWithQuantity;

public class BusinessLogic {	
	public static void getSortedListOfProducts(ProductType productType){
		List<Product> listOfProducts = new ProductDAOImpl().giveAllProducts(productType);
		SortProductTypeWithQuantity sortProductTypeWithQuantity = new SortProductTypeWithQuantity();
		Collections.sort(listOfProducts, sortProductTypeWithQuantity);
		Collections.reverse(listOfProducts);
		listOfProducts.forEach(System.out::println);
	}

}
