package coreJavaAssignment;
//Write a Java program to reverse a number
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ReverseNum {

	public static void main(String[] args) {
		
		String str = "123456";
		String[] a = str.split("");
		List<String> list = Arrays.asList(a);
		System.out.println(list);
		Collections.reverse(list);
		System.out.println(list);
		
	}

}
