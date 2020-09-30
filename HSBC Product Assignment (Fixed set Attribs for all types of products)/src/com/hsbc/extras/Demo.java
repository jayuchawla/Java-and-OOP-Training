package com.hsbc.extras;

import com.hsbc.logic.BusinessLogic;
import com.hsbc.producttype.ProductType;

public class Demo {

	public static void main(String[] args) {
		BusinessLogic.getSortedListOfProducts(ProductType.ELECTRONIC);
	}

}
