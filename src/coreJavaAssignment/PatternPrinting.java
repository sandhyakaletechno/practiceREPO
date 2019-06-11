package coreJavaAssignment;
/*
 * 5 4 3 2 1 
	4 3 2 1 
	3 2 1 
	2 1 
	1 
 * */
public class PatternPrinting {
	public void printPattern(int n){
		for(int i=5;i>0;i--){
			for(int j=i;j>0;j--){
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
	}
	
	
	public static void main(String[] args) {
		PatternPrinting d= new PatternPrinting();
		d.printPattern(5);	
	}

}
