package basic;
/*
 * 1234567
   234567
    34567
     4567
      567
       67
        7
       67
      567 
     4567  *
    34567   *
   234567    *
  1234567     *
       */
public class Pattern22 {

	public static void main(String[] args) {
		for(int i=1; i<=7; i++){
			for(int k=0;k<=i;k++){
				//System.out.print(" ");
			}
		for(int j=i;j<=7;j++){
			System.out.print(j);
		}
		
		
		System.out.println();
		}
		
		for(int i=2;i<7;i++){
			for(int j=1;j<7;j++){
				for(int k=6;k>=1;k--){
					System.out.print("");
				}
			
				System.out.println();
			}
		}
		
		
	}

}
