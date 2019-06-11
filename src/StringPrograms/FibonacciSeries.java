package StringPrograms;
import java.util.Scanner;

public class FibonacciSeries {

	static void Series(int A){
		System.out.println(A);
		int next,first_value=0,second_value=1;
	for(int i=0;i<A;i++){
		if(i<=1)
			next=i;
		else{
			next=first_value+second_value;
			first_value=second_value;
			second_value=next;
		}
		System.out.print(next);
		
		
		
		
	}
		
		
	}
	
	
	public static void main(String[] args) {
	Scanner sc= new Scanner(System.in);
	System.out.println("Give number of element=");
	int A= sc.nextInt();
	Series( A);
	}

}
