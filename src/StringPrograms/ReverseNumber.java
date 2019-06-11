package StringPrograms;
import java.util.Scanner;
public class ReverseNumber {
		static void ReverseNumber(String A){
			String[] s =A.split("");
			for(int i=s.length-1;i>=0;i--){
				System.out.print(s[i]);
			}
		}
	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("Give input number to reverse=");
		String A= sc.nextLine();
		ReverseNumber(A);
	}

}
