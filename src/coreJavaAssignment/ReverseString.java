package coreJavaAssignment;

import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

//)Write a Java program to reverse a String
public class ReverseString {

	public static void main(String[] args) {
		String str = "my name is sandhya";
		 str.split(" ");
		String[] ss=str.split("");
		
		List<String> list = Arrays.asList(ss);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		
		
	}

}
