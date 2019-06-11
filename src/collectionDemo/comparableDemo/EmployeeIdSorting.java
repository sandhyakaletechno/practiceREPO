package collectionDemo.comparableDemo;

import java.util.Comparator;

public class EmployeeIdSorting implements Comparator<Employee1> {


@Override
public int compare(Employee1 o1, Employee1 o2) {
	// TODO Auto-generated method stub
	if(o1.id>o2.id)
		return 1;
		else if (o1.id<o2.id)
			return -1;
		else
		return 0;
}
	
}
