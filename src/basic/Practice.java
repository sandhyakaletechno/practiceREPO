package basic;
import java.util.Scanner;

public class Practice {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row= sc.nextInt();
		System.out.println("Given number of rows : "+row);
		/*for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=i;j++)
			{
				
				System.out.print("*");
			}
			System.out.println(" ");
		}*/
		
		
		for(int i=1;i<=row;i++)
		{
			for(int j=row-1;j>=i;j--)
			{
				
				System.out.print("*");
			}
			System.out.println(" ");
		}
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}


