package coreJavaAssignment;

public class ContainsNumber {
		static void containsNum(int A[],int num){
			for(int i=0;i<=A.length-1;i++){
				if(A[i]==1){
					System.out.println("Given number present in array");
						break;
				}
					else
				System.out.println("not present");
				break;
			}
		}
	public static void main(String[] args) {
		int A[]=new int[]{1,4,6,8,10,11,12};
		int num=11;
		containsNum(A,num);
	}

}
