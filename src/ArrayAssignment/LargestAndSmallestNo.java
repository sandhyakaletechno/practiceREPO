package ArrayAssignment;

public class LargestAndSmallestNo {
	static void findNum(int []A, int length){
		int largest=A[0];
		int smallest=A[0];
		for(int i=1;i<=length-1;i++){
			if(A[i]>largest){
				largest=A[i];
			}else if(A[i]<smallest){
				smallest=A[i];
				
			}
		}
		System.out.println("Largest num is:"+largest+" "+"smallest num is:"+smallest);
	}

	public static void main(String[] args) {
		int A[]= new int[]{12,13,14,15,16,17};
		int length= A.length;
		findNum(A, length);
	}

}
