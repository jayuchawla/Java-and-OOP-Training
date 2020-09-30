package com.hsbc.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.hsbc.connection.DBConnection;
import com.hsbc.entities.Product;
import com.hsbc.exceptions.ProductTypeNotFoundException;
import com.hsbc.productfactory.ProductFactory;
import com.hsbc.producttype.ProductType;

public class ProductDAOImpl implements ProductDAO {

	private DBConnection dbConnection;

	public ProductDAOImpl() {
		// TODO Auto-generated constructor stub
		dbConnection = new DBConnection();
	}

	@Override
	public void insertProduct(Product product) {
		// TODO Auto-generated method stub
		String tableName = product.getProductType().name().toLowerCase();
		String query = String.format("insert into %s values(?,?,?,?)", tableName);
		System.out.println(tableName);
		System.out.println(query);
		PreparedStatement preparedStatement = dbConnection.getPreparedStatement(query);
		try {
			//preparedStatement.setString(, tableName);
			preparedStatement.setInt(1, product.getProductId());
			preparedStatement.setString(2, product.getProductName());
			preparedStatement.setDouble(3, product.getProductUnitPrice());
			preparedStatement.setInt(4, product.getQuantity());
			preparedStatement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public void removeProduct(int productId) {
		// TODO Auto-generated method stub

	}

	@Override
	public void updateProduct(int productId, Product product) {
		// TODO Auto-generated method stub

	}

	@Override
	public List<Product> giveAllProducts(ProductType productType) {
		// TODO Auto-generated method stub
		List<Product> listOfProducts = new ArrayList<>();

		String tableName = productType.name().toLowerCase();
		String query = String.format("select * from %s", tableName);

		PreparedStatement preparedStatement = dbConnection.getPreparedStatement(query);
		try {
			ResultSet resultSet = preparedStatement.executeQuery();
			while (resultSet.next()) {
					listOfProducts.add(ProductFactory.makeProduct(productType, resultSet.getInt(1),
							resultSet.getString(2), resultSet.getDouble(3), resultSet.getInt(4)));
			}
		} catch (SQLException | ProductTypeNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return listOfProducts;
	}	

}
