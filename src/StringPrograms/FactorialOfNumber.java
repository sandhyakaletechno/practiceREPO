package StringPrograms;

import java.util.Scanner;

public class FactorialOfNumber {
		static void	factNumber(int a){
				int A= 5;int fact=1;
				for(int i=1;i<=5;i++){
					fact= fact*i;
				}
				System.out.print("factorial of number is ="+fact);
			}
	
			
	public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			System.out.println("Give number:");
			int a= sc.nextInt();
			factNumber(a);
}
}