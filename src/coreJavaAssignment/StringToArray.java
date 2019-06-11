package coreJavaAssignment;

import java.util.Arrays;
import java.util.List;

//Write a java program to convert a string into an array
public class StringToArray {

	public static void convert(String m){
		//System.out.println(m);
		String[] a = m.split(" ");
		for(int i = 0;i<a.length;i++){
			System.out.print(a[i]+" ");
		}
		
		List<String> list = Arrays.asList(a);
		System.out.println(list);
		
	}
	
	
	
	
	public static void main(String[] args) {
		String msg = "my name is sandhya. I am a technocredit student";
		convert(msg);
	
	
	}

}
