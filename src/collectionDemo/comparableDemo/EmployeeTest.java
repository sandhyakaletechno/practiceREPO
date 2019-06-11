package collectionDemo.comparableDemo;

import java.util.ArrayList;
import java.util.Collections;

public class EmployeeTest {

	public static void main(String[] args) {
		ArrayList<Employee1> al = new ArrayList<Employee1>();
		al.add(new Employee1(12,"sudha","pune"));
		al.add(new Employee1(155,"Sandhya","Aurangabad"));
		al.add(new Employee1(1,"cherry","london"));
		Collections.sort(al, new EmployeeIdSorting());
		System.out.println(al);
		Collections.sort(al, new EmployeeCitySorting());
		System.out.println(al);
		Collections.sort(al,new EmployeeNameSorting());
		System.out.println(al);
	}

}
