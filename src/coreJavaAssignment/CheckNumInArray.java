package coreJavaAssignment;

import java.util.Scanner;

//Write a program to check specific number in an array.
public class CheckNumInArray {
	public static boolean checknum(int m){
		int [] n= {11,12,13,14,15,16};
		for(int i: n){
			if(i==m)
				
				return true;
		}
				return false;
		
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("give values in array");
		int m = sc.nextInt();
		
		
		System.out.println(checknum(m));
	}

}
