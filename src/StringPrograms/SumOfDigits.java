package StringPrograms;

import java.util.Scanner;

public class SumOfDigits {
		static	int getSum(int a){
				
				int sum=0;
				for(int i=1;i<=5;i++){
					int temp=a%10;
					 sum= sum+temp;
					 a=a/10;
				}
				
				return sum;
			}
			
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give number=:");
		int a= sc.nextInt();
		System.out.println(getSum(a));
	}
}