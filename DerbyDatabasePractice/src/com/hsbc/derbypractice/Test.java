package com.hsbc.derbypractice;

import com.hsbc.dao.EmployeeDAOImpl;
import com.hsbc.models.Employee;

/**
 * This class is used as entry point to Employee Management system.
 * 
 * @author Jayprakash Chawla
 *
 */

public class Test {

	public static void main(String[] args) {

		EmployeeDAOImpl edi = new EmployeeDAOImpl();
		edi.truncateTable();

		edi.insertEmployee(new Employee(1, "jayu", 99000));
		edi.insertEmployee(new Employee(2, "ankita", 98000));
		edi.insertEmployee(new Employee(3, "arpit", 100000));

		System.out.println(edi.getAllEmployees());

		// edi.deleteEmployee(2);
		System.out.println(edi.sortEmployeesWithSalary());

		edi.closeConnection();
	}
}
