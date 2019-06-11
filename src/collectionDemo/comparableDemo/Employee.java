package collectionDemo.comparableDemo;

import java.util.Comparator;

public class Employee implements Comparator<Employee> {
	String empName;
	int deptId;
	String city;
	
		
	public Employee(String empName, int deptId, String city) {
		super();
		this.empName = empName;
		this.deptId = deptId;
		this.city = city;
	}

	@Override
	public int compare(Employee emp1, Employee emp2) {
		// TODO Auto-generated method stub
		return emp1.empName.compareTo(emp2.empName);
	}
	
	
	
	
	
}
