package com.hsbc.dao;

import java.util.List;

import com.hsbc.models.Employee;

/**
 * This interface is used to provide abstraction for EmployeeDAOImpl class.
 * 
 * @author Jayprakash Chawla
 *
 */

public interface EmployeeDAO {

	public List<Employee> getAllEmployees();

	public void insertEmployee(Employee e);

	public void deleteEmployee(int empId);

	public void updateEmployeeSalary(int empId, int newSalary);

	public void truncateTable();

	public List<Employee> sortEmployeesWithSalary();
}
