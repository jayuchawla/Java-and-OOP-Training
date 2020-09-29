import java.util.ArrayList;
import java.util.HashSet;

public class Employee implements Comparable<Employee>{
	
	private int empId;
	private String empName;
	private int salary;
	private HashSet<String> skills;
	
	public Employee(int empId, String empName, int salary, HashSet<String> skills) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.salary = salary;
		this.skills = skills;
	}

	
	public String getEmpName() {
		return empName;
	}


	public void setEmpName(String empName) {
		this.empName = empName;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", salary=" + salary + ", skills=" + skills + "]";
	}


	@Override
	public int compareTo(Employee o) {
		// TODO Auto-generated method stub
		if(this.salary > o.salary) {
			return 1;
		}
		else if(this.salary < o.salary) {
			return -1;
		}
		else {return 0;}
	}

}
