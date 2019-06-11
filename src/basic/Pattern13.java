package basic;
/*
1
12
123
1234
12345
123456
1234567
123456
12345
1234
123
12
1*/
import java.util.Scanner;

public class Pattern13 {
	static void PatternPrint(int n){
		for(int i=1;i<=7;i++){
			for(int j=1;j<=i;j++){
				System.out.print(j+" ");
			}
		System.out.println();
		}
			/*for(int i=1;i<=7;i++){
				int count=0;
			for(int k=6;k>=i;k--){
				count++;
				System.out.print(count);
				
			}
		
			System.out.println();
			}*/
		
		for(int i=1;i<=6;i++){
			for(int j=1;j<=7-i;j++){
				System.out.print(j+" ");
			}
			System.out.println();
		}
		//System.out.println();
		
	}
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Give value of n:");
		int n=sc.nextInt();
		
		PatternPrint(n);
	
}
}

