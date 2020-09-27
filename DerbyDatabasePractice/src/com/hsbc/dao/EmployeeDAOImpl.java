package com.hsbc.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import com.hsbc.databaseconnection.DbConnection;
import com.hsbc.models.Employee;
import com.hsbc.sortutil.SortWithEmployeeSalary;

/**
 * This class provides implementation to EmployeeDAO interface.
 * 
 * @author Jayprakash Chawla
 *
 */

public class EmployeeDAOImpl implements EmployeeDAO {

	DbConnection db;
	PreparedStatement pst;
	Statement st;

	public EmployeeDAOImpl() {
		// TODO Auto-generated constructor stub
		db = new DbConnection();
		pst = null;
		st = null;
	}

	@Override
	public List<Employee> getAllEmployees() {

		List<Employee> listEmp = new ArrayList<>();

		try {
			pst = db.getPreparedStatement("select * from employee");
			ResultSet rs = pst.executeQuery();
			while (rs.next()) {
				listEmp.add(new Employee(rs.getInt(1), rs.getString(2), rs.getInt(3)));
			}
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		// TODO Auto-generated method stub
		return listEmp;
	}

	@Override
	public void insertEmployee(Employee e) {
		// TODO Auto-generated method stub
		try {
			pst = db.getPreparedStatement("insert into employee values(?,?,?)");
			pst.setInt(1, e.getEmpId());
			pst.setString(2, e.getEmpName());
			pst.setInt(3, e.getSalary());
			pst.executeUpdate();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void updateEmployeeSalary(int empId, int newSalary) {
		// TODO Auto-generated method stub
		try {
			pst = db.getPreparedStatement("update employee set empSalary = ? where empId = ?");
			pst.setInt(1, newSalary);
			pst.setInt(2, empId);
			pst.executeUpdate();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
		// TODO: handle exception
	}

	@Override
	public void deleteEmployee(int empId) {
		// TODO Auto-generated method stub
		try {
			pst = db.getPreparedStatement("delete from employee where empId = ?");
			pst.setInt(1, empId);
			pst.executeUpdate();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}

	@Override
	public void truncateTable() {
		// TODO Auto-generated method stub
		try {
			pst = db.getPreparedStatement("truncate table employee");
			pst.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

	@Override
	public List<Employee> sortEmployeesWithSalary() {
		// TODO Auto-generated method stub
		List temp = this.getAllEmployees();
		SortWithEmployeeSalary s = new SortWithEmployeeSalary();
		Collections.sort(temp, s);
		return temp;
	}

	public void closeConnection() {
		db.closeConnection();
	}

}
