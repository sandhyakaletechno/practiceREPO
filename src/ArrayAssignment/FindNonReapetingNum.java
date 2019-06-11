package ArrayAssignment;

public class FindNonReapetingNum {
		static void nonRepeatingNum(int []A,int len){
			for(int i=0;i<len;i++){
				for(int j=0;j<len;j++){
					if(i!=j && A[i]==A[j])
						break;
				
			if(j==len)
				System.out.println("hi");
			}

			
			}
			
		}
	public static void main(String[] args) {
		int A[]= new int[] {1,1,2,2,3,4,4,5,5};
		int len= A.length;
		nonRepeatingNum(A, len);
		System.out.println();
		
	}

}
