package collectionDemo1;

import java.util.ArrayList;
import java.util.Comparator;

public class Student implements Comparable<Student>{
	String name;
	int rno;
	int height;
	
	public Student(String name, int rno, int height) {
		super();
		this.name = name;
		this.rno = rno;
		this.height = height;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rno=" + rno + ", height=" + height + "]";
	}

	/*@Override
	public int compareTo(Student o) {
		if(this.rno==o.rno)
			return 0;
		else if(this.rno>o.rno)
			return 1;
		else
			return -1;
		//return this.name.compareTo(o.name);
	}*/

	/*@Override
	public int compare(Student o1, Student o2) {
		
		return o1.name.compareTo(o2.name);
	}*/

	@Override
	public int compareTo(Student o) {
		// TODO Auto-generated method stub
		return this.name.compareTo(o.name);
	}
		
		
		
		
	}
	
	
	 
	
	


