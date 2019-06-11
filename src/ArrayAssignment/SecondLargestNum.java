package ArrayAssignment;

import java.util.Arrays;

public class SecondLargestNum {

	public static void main(String[] args) {
		int A[]=new int[] {10,20,30,50,100,20,80};
		int temp,size;
		size=A.length;
		
	//	Arrays.sort(A);
		
		for(int i=0;i<size;i++){
			for(int j=i+1;j<size;j++){
				if(A[i]>A[j]){
					temp=A[i];
					A[i]=A[j];
					A[j]=temp;
				}
			}
		}
		System.out.println("Second largest number is:"+A[size-2]);
	}

}
