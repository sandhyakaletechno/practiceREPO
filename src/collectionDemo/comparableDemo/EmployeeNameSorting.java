package collectionDemo.comparableDemo;

import java.util.Comparator;

public class EmployeeNameSorting implements Comparator<Employee1>{
public int compare(Employee1 o1 , Employee1 o2){
	return o1.name.compareTo(o2.name);
}


}
