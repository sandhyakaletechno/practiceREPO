package questions;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

//Write a java program to illustrate use of LinkedList 
//Ex- create a class Student with fields rollNo, name, address, age 

public class Student {
	Integer rollno;
	String name;
	String address;
	Integer age;
	Student(Integer a,String s,String c,Integer W){
		
	}
	
	
	public static void main(String[] args) {
	List <Student> li = new LinkedList<Student>();
	li.add(new Student(1,"sandhya","akurdi",20));
	li.add(new Student(2,"sudha","aurangabad",24));
	li.add(new Student(3,"Roshani","pcmc",15));
	li.add(new Student(4,"Divya","Chikhali",26));
	System.out.println(li);
	
	//Student s1 = li.get(i);//use for loop on object
	//System.out.println(s1.address + ":"+ s1.name);
	li.remove(0);
	System.out.println(li);
	li.add(0, new Student(10,"akanksha","aurangabad",28));
	System.out.println(li);
	System.out.println(li.indexOf(li));
	Iterator itr = li.iterator();
	while(itr.hasNext()){
		System.out.println(itr.next());//not getting ans here
	}
	
		
		
		
		
	}

}
