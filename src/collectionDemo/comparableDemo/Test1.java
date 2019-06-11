package collectionDemo.comparableDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test1 {
public static void main(String[] args) {
	ArrayList<Student1> al = new ArrayList<Student1>();
	Student1 s1 = new Student1(10,"asandhya");
	Student1 s2 = new Student1(1,"Sudha");
	Student1 s3 = new Student1(2,"mcherry");

	al.add(s1);
	al.add(s2);
	al.add(s3);
	Collections.sort(al);
	System.out.println(al);
}
}
