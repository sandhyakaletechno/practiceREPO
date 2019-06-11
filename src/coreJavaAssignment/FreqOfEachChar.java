package coreJavaAssignment;

import java.util.HashMap;

//Write a Java program to find occurrences of each character in a string
public class FreqOfEachChar {

	public static void frequency(String str){
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		char[] str2 = str.toCharArray();
		System.out.println(hm);//{}//why it does not show values in hashmap???????
		
		for(int i=0;i<str2.length;i++){
			if(hm.containsKey(str2[i])){
				hm.put(str2[i],hm.get(str2[i])+1);
			}
			else{
				hm.put(str2[i],1);
				
			}
			
			
		}
	
		System.out.println(hm);
		
	}
	
	
	public static void main(String[] args) {
		
		String str1= "hello technocredits students";
		frequency("hello technocredits students");
		
		
	}

}
