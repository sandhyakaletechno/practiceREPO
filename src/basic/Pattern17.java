package basic;
/* 7   
 * 7 6 
 * 7 6 5 
 * 7 6 5 4 
 * 7 6 5 4 3 
 * 7 6 5 4 3 2 
 * 7 6 5 4 3 2 1
 * 
 * */
public class Pattern17 {

	public static void main(String[] args) {
		for(int i=1;i<=7;i++){
			int count=8;
			for(int j=1;j<=i;j++){
				count--;
				System.out.print(count+" ");
			}
			System.out.println();
		}
		

	}

}
