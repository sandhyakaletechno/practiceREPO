package examplesonscanner;
import java.util.Scanner;

public class ScannerDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first name:");
		String fname = sc.next();
		String lname = sc.next();
		
		sc.close();
		System.out.println(fname+"!!");
		System.out.println(lname+"@@");

	}

}
