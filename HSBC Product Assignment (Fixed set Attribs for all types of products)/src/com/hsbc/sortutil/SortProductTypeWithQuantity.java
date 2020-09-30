package com.hsbc.sortutil;

import java.util.Comparator;

import com.hsbc.entities.Product;

public class SortProductTypeWithQuantity implements Comparator<Product> {

	@Override
	public int compare(Product arg0, Product arg1) {
		// TODO Auto-generated method stub
		int q1 = arg0.getQuantity();
		int q2 = arg1.getQuantity();
		if(q1==q2) {
			return 0;
		}
		return arg0.getQuantity() > arg1.getQuantity() ? 1 : -1;
	}

}
