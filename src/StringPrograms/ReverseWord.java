package StringPrograms;

public class ReverseWord {

	public static void main(String[] args) {
		String s="hellow good morning to all";
		String[] A=s.split(" ");
		
		int length= A.length;
		for(int i=0;i<=length-1;i++){
			
				String[] t=A[i].split("");
				
				for(int j=t.length-1;j>=0;j--){
					System.out.print(""+t[j]+"");
				}
				System.out.print(" ");
		}
	}

}
