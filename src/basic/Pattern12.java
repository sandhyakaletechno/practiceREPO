package basic;
/*
1111111
1111122
1111333
1114444
1155555
1666666
7777777*/
import java.util.Scanner;

public class Pattern12 {
	static void PatternPrint(int n){
		for(int i=1;i<=n;i++){
			
			for(int j=n-1;j>=i;j--){
			System.out.print("1");
		}
			for(int k=1;k<=i; k++){
				System.out.print(i);
			}
		System.out.println();
	}
	
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Give value of n=");
		int n= sc.nextInt();
		PatternPrint(n);
		
	}

}
