package com.hsbc.extras;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * This class is not a part of employee management system and is just used to
 * test the functionality of DbConnection class.
 * 
 * @author Jayprakash Chawla
 *
 */

public class Demo {
	public static void main(String[] args) {
		try {
			Class.forName("org.apache.derby.jdbc.EmbeddedDriver");
			Connection con = DriverManager.getConnection("jdbc:derby:jayu;create=true");

			PreparedStatement st = con.prepareStatement("insert into tab1 values(1, 'jayu', 34)");
			// st.execute("create table person(personid int)");
			// st = con.prepareStatement("select * from tab1");
			st.executeUpdate();
			st = con.prepareStatement("select * from tab1");
			// ResultSet rs = st.executeQuery();
			// while(rs.next()) {
			// System.out.println(rs.getInt(1)+" "+rs.getString(2) + " " + rs.getInt(3));
			// }

			System.out.println(st.execute("create table tab1(empId int, empName varchar(20), empSalary int)"));
			con.close();
		} catch (ClassNotFoundException e) {
			// TODO: handle exception
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
//	forName();

}
