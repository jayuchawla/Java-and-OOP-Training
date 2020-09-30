package com.hsbc.connection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

public class DBConnection {
	
	private Connection connection;
	
	public DBConnection() {
		// TODO Auto-generated constructor stub
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/database_practice","root","root");
		}catch(ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
	}
	
	public final PreparedStatement getPreparedStatement(String query) {
		PreparedStatement preparedStatement = null;
		try {
			preparedStatement = connection.prepareStatement(query);
		}catch (SQLException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		return preparedStatement;
	}
	
	public final Statement getStatement() {
		Statement statement = null;
		try {
			statement = connection.createStatement();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return statement;
	}
}
