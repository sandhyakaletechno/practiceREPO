package ArrayAssignment;

public class DuplicateNo {

	public static void main(String[] args) {
		//int A[]=new int [] {1,2,4,6,2,4};
		int A[]= {1,2,4,6,2,3,4,7,8,9};
		//0 to 5
		for(int i=0;i<A.length-1;i++){
			//1 to 5
			for(int j=i+1;j<A.length;j++){
			if(A[i]==A[j])
				System.out.println("Duplicate number is:"+ A[i]);
			}
		}
		
		
		
	}

}
