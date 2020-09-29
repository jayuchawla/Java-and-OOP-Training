import java.util.Comparator;

//E-Commerce websites have such Comarator classes which 
public class SalaryComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee o1, Employee o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
	}

}
