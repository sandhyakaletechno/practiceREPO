package StringPrograms;
import java.math.BigInteger;
import java.util.Scanner;
public class ArmstrongNumber {
		
	static void Armstrong(String a){
		String[] s= a.split("");
		int sum=0;
		for(int i=0;i<s.length;i++){
			
			 sum= sum+ Integer.parseInt(s[i]) *Integer.parseInt(s[i])*Integer.parseInt(s[i]);
			 
		}
		System.out.println("sum is "+sum);
	}

	public static void main(String[] args) {
		
		Armstrong("153");
	}

}
