package basic;
/*
1 2 3 4 5 6 7 
1 2 3 4 5 6 
1 2 3 4 5 
1 2 3 4 
1 2 3 
1 2 
1 
1 2 
1 2 3 
1 2 3 4 
1 2 3 4 5 
1 2 3 4 5 6 
1 2 3 4 5 6 7 */
import java.util.Scanner;

public class Pattern14 {
	static void PatternPrint(int n){
		
		for(int i=1;i<=n;i++){
			int count=0;
			for(int j=n;j>=i;j--){
				count++;
			System.out.print(count+" ");
			}System.out.println();
		}
	for(int i=2;i<=n;i++){
		for(int j=1;j<=i;j++){
			System.out.print(j+" ");
		}System.out.println();
	}
	
	
	
	
	}
	
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Give value of n:");
		int n=sc.nextInt();
		PatternPrint(n);
	}

}
