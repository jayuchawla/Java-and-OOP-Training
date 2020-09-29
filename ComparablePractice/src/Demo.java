import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;

public class Demo {
	public static void main(String[] args) {
		
		ArrayList<Employee> ale = new ArrayList<>();
		HashSet<String> e = new HashSet<>();
		
		e.add("Java");
		e.add("Python");
		
		ale.add(new Employee(1, "j", 93,e));
		ale.add(new Employee(2, "a", 45,null));
		ale.add(new Employee(3, "b", 56,e));
		
		SalaryComparator sc = new SalaryComparator();
		NameComparator nc = new NameComparator();
		
		Collections.sort(ale, nc);
		Collections.reverse(ale);
		
		System.out.println(ale);
		
		
	}
}
