package collectionDemo.comparableDemo;

import java.util.Comparator;

public class Student1 implements Comparable<Student1>{

	
	int rno;
	String name;
	public Student1(int rno, String name) {
		super();
		this.rno = rno;
		this.name = name;
	}
	
	public int compareTo(Student1 o){
		if(this.rno>o.rno)
		return 1;
		else if(this.rno<o.rno)
		return -1;
		else
		return 0;
		
	//	return this.name.compareTo(o.name);
		
	}
	
	
	public String toString(){
		return rno+"-->"+name;
	}

	
	
	
	
	
	
	
	
	
}
