package collectionDemo.comparableDemo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		ArrayList<String> al = new ArrayList<String>();
		//wahi chije sort kar sakte ho jo comparable or comparative class ko implements karte ho
		// here string comparable class ko implements karta he
		//all wrapper classes implements comparable class ko implements karte he
		al.add("Maulik");
		al.add("Techno");
		al.add("Atul");
		//tree map, tree set -->comparator /comparable ko implement karna padega..if user defined class he...like student
		Collections.sort(al);
		//System.out.println(al);
		
		
		Student s1 = new Student(10,"Disha");//this
		Student s2 = new Student(1,"Swapnil");//o
		Student s3 = new Student(2,"Kunal");//o//sort on may b on name or on roll number
		
		ArrayList<Student> stuList = new ArrayList<Student>();//how u sort user defined data types
		stuList.add(s1);
		stuList.add(s2);
		stuList.add(s3);
		Collections.sort(stuList);//error here becuse user defined class pe sorting applicable nahi he
		
		// System.out.println(stuList);//equal
		//System.out.println(stuList.get(0));//equal//override toString method
		 
		 //reference variable ke piche always toString method call hoti he
		 
		// System.out.println(s2);
		 System.out.println("Maulik".compareTo("maulik"));//-32 means M is small
		 
	}

}
