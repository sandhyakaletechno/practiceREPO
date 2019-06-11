package collectionDemo.comparableDemo;

import java.util.Comparator;

public class Employee1 {
	int id;
	String name;
	String city;
	public Employee1(int id, String name, String city) {
		super();
		this.id = id;
		this.name = name;
		this.city = city;
	}
	
	
	public String toString(){
		return id+" "+name+" "+city;
		
	}
	
	
	
}
