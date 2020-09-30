package com.hsbc.dao;

import java.util.List;

import com.hsbc.entities.Product;
import com.hsbc.producttype.ProductType;

public interface ProductDAO {
	public void insertProduct(Product product);
	public void removeProduct(int productId);
	public void updateProduct(int productId, Product product);
	public List<Product> giveAllProducts(ProductType productType);
}
