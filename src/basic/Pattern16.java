package basic;
/* 1 2 3 4 5 6 7                      
 * 1 2 3 4 5 6 
 * 1 2 3 4 5 
 * 1 2 3 4 
 * 1 2 3 
 * 1 2 
 * 1 
 * 
 * 
 * 
 * */
public class Pattern16 {

	public static void main(String[] args) {
		for(int i=1;i<=7;i++){
			int count=0;
			for(int j=7;j>=i;j--){
				count++;
				System.out.print(count+" ");
			}
			System.out.println();
		}
	}

}
