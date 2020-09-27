package com.hsbc.sortutil;

import java.util.Comparator;

import com.hsbc.models.Employee;

/**
 * This class is used to compare two Employee class objects wrt their salary
 * 
 * @author Jayprakash Chawla
 *
 */
public class SortWithEmployeeSalary implements Comparator<Employee> {

	@Override
	public int compare(Employee arg0, Employee arg1) {
		// TODO Auto-generated method stub
		if (arg0.getSalary() != arg1.getSalary()) {
			return arg0.getSalary() > arg1.getSalary() ? 1 : -1;
		}
		return 0;
	}

}
