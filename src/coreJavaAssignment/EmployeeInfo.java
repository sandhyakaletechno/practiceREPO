package coreJavaAssignment;

import java.util.HashMap;
import java.util.Map;

// Write a java program to use hashmap with user defined objects
public class EmployeeInfo {
	
	 EmployeeInfo(Integer a,String b,String c){
	 Integer id;
	 String name;
	 String city;
	 
	}
	

	public static void main(String[] args) {
		
	Map<Integer,EmployeeInfo> hm = new HashMap<>();
	hm.put(1,new EmployeeInfo(01,"sandhya","Aurangabad"));
	hm.put(2,new EmployeeInfo(02,"Shravya","Pune"));
	hm.put(3,new EmployeeInfo(03,"Advika","surat"));
	hm.put(4, new EmployeeInfo(04,"Sharanya","mumbai"));
	hm.put(5, new EmployeeInfo(05,"Akshata","Nashik"));
		System.out.println(hm.keySet());
	hm.replace(5,new EmployeeInfo(06,"rohan","chennai"));//how to replace//not getting ans here
		System.out.println(hm.keySet());
		
	for(Map.Entry<Integer,EmployeeInfo> entry: hm.entrySet()){
		System.out.println(entry);
		//not getting ans here
	}
	
	
	}	
	}		
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

