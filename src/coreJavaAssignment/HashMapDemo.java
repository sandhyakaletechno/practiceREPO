package coreJavaAssignment;

import java.util.HashMap;
import java.util.Map;

/*Write a java program to demonstrate use of Hashmap and perform following operations
a) Iterate over hashmap
b) Put a value in Hashmap
c) Replace a value in Hashmap
*/
public class HashMapDemo {
//how to use replaceAll method??????
//how to change string????how to replace apple????
	public static void main(String[] args) {
		HashMap<String,Integer> hm = new 	HashMap<String,Integer>();
		hm.put("apple",6);
		hm.put("pineapple",8);
		hm.put("custurdapple",9);
		hm.put("strawberry",7);
		hm.put("watermelon",5);
		System.out.println(hm);
		
		//hm.replaceAll(function);
		hm.put("apple",100);
		hm.replace("pineapple",8,50);
		for(Map.Entry<String,Integer> entry : hm.entrySet()){
			System.out.println(entry);
		}
		System.out.println(hm);
	}

}
