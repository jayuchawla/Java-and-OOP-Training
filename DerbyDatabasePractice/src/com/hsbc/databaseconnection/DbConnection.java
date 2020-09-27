package com.hsbc.databaseconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * This class is used to instantiate a database connection object.
 * 
 * @author Jayprakash Chawla
 *
 */

public class DbConnection {

	private Connection con;
	private Statement st;
	private PreparedStatement pst;

	public DbConnection() {
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	public Statement getStatement() {
		try {
			con = DriverManager.getConnection("jdbc:derby:jayu;create=true");
			st = con.createStatement();
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return st;
	}

	public Connection getCon() {
		return con;
	}

	public void setCon(Connection con) {
		this.con = con;
	}

	public PreparedStatement getPreparedStatement(String sql) {
		try {
			con = DriverManager.getConnection("jdbc:derby:jayu;create=true");
			pst = con.prepareStatement(sql);
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return pst;
	}

	public void closeConnection() {
		try {
			con.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
