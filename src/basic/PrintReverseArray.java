package basic;

public class PrintReverseArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//String s="Sandhya Foke Good Morning";
		String s="hellow good morning to all";
		String[] A=s.split(" ");
		
		int length= A.length;
		
		//Reverse String
		/*for(int i= length-1;i>=0;i--){
			//if(i>3)
				System.out.print(A[i]+" ");
		}*/
		//Reverse string and characters in the string
		for(int i= length-1;i>=0;i--){
			//if(i>3)
				//System.out.print(A[i]+" ");
				String[] t=A[i].split("");
				//System.out.println(t[0]);
				//int len= t.length;
				
				for(int j=t.length-1;j>=0;j--){
					System.out.print(""+t[j]+"");
				}
				System.out.print(" ");
		}
		

	}

}
