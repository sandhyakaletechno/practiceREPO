package StringPrograms;
import java.util.Scanner;
public class ReverseString {

	static void Reverse(String s){
		
		String[] A= s.split(" ");
		int length=A.length;
			for(int i=length-1;i>=0;i--){
				String[] t=A[i].split("");
				for(int j=t.length-1;j>=0;j--){
					System.out.print(""+t[j]+"");
					
				}
			System.out.print(" ");
			}
			
	}
	
	
		public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Give input string=" );
		String s=sc.nextLine();
		System.out.println(s);
		Reverse(s);
	}

}
