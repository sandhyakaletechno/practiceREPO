package coreJavaAssignment;

public class SwapTwoNumbers {
	public void SwapTwoNumbers(int x){
		
		x = (x %10)*10+(x/10);
		
		System.out.println(x);
		
		
		
	}
	
	
	

	public static void main(String[] args) {
		SwapTwoNumbers s = new SwapTwoNumbers();
		s.SwapTwoNumbers(32);

	}

}
