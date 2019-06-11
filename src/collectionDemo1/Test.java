package collectionDemo1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
	
	
	public static void main(String args[]){
	ArrayList<Student> al = new ArrayList<Student>();
	
	Student s1= new Student("Sandhya",100,10);
	Student s2= new Student("Amruta",20,19);
	Student s3= new Student("Sudha",5,9);
	Student s4= new Student("Roshan",7,21);
	Student s5= new Student("Kajal",19,20);
	 
	al.add(s1);
	al.add(s2);
	al.add(s3);
	al.add(s4);
	al.add(s5);
	//System.out.println(al);
	
	
	Collections.sort(al);
	//Collections.sort(al,new SortOnRno());
	
	/*for(Student st:al){
		System.out.println(st.name);//this is without implementing ToString method......
	}*/
	
	System.out.println(al);
	
	}
	
	
}
