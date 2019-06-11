package collectionDemo.comparableDemo;

import java.util.Comparator;

public class EmployeeCitySorting implements Comparator<Employee1> {

	@Override
	public int compare(Employee1 o1, Employee1 o2) {
		// TODO Auto-generated method stub
		
		
		
		
		
		return o1.city.compareTo(o2.city);
	}

	
	
	
	
}
