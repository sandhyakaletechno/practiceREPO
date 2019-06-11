package basic;
import java.util.Scanner;
public class PatternPrinting {

	public static void main(String[] args) {

		
		Scanner sc= new Scanner(System.in);
		int row=sc.nextInt();
		System.out.println("give value of row:"+row);
				
		
		//use scanner class to take value of row
		PatternPrinting(row);
	
	}
	
	static void PatternPrinting(int row){
		//int row=4;
		for (int i = 1; i <row; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		for (int i = row-2; i >=1; i--) {

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		
	}
}
		/*
		 * for(int i=1; i<=5;i++){
		 * 
		 * for(int j=1;j<=i;j++){ System.out.print(j);
		 * 
		 * 
		 * } System.out.println(); }
		 */
		/*
		 * for(int i=1; i<=5;i++){
		 * 
		 * for(int j=1;j<=i;j++){ System.out.print("*");
		 * 
		 * 
		 * } System.out.println(); }
		 */

		/*
		 * for(int i=1; i<=5;i++){
		 * 
		 * for(int j=1;j<=2*i-1;j++){ System.out.print("*");
		 * 
		 * 
		 * } System.out.println(); }
		 */

		/*
		 * for(int i=1; i<=5;i++){
		 * 
		 * for(int j=1;j<=6-i;j++){ System.out.print(j);
		 * 
		 * 
		 * } System.out.println(); }
		 */

		/*
		 * 1 1 2 3 1 2 3 4 5
		 */

		/*
		 * for(int i=1; i<=3;i++){
		 * 
		 * for(int j=1;j<=2*i-1;j++){ System.out.print(j);
		 * 
		 * 
		 * } System.out.println(); }
		 */

		/*
		 * * * * * * * * * * * * * * * * *
		 */

		/*for (int i = 1; i <= 4; i++) {

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		for (int i = 5; i >= 1; i--) {

			for (int j = 1; j <= i; j++) {
				System.out.print("*");
			}
			System.out.println();
			
		}
		*/	
		
		

	

//}
