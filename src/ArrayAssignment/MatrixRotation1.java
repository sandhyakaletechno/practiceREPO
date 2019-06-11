package ArrayAssignment;

public class MatrixRotation1 {
	
	public static int[][] rotateMatrix(){
		int A[][] ={{7,9,10,3},
				{4,5,3,11},
				{9,13,2,7},
				{4,1,12,17}};
		
		int temp[][]=new int[4][4];
		int x[][]= new int[4][4];
		for(int i=0;i<=3;i++){
			for(int j=0;j<=3;j++){
			 temp[j][4-i-1]=A[i][j];
			  x[i][j]= temp[j][4-i-1];
			  //System.out.print(x[i][j]+"\t");
			}
			//System.out.println();
		}
		return x;
	}
		
		
	public static void main (String[] args){
		int temp[][]=rotateMatrix();
				//System.out.print(x+" ");
				
			
			//System.out.println();
		
		for(int i=0;i<=3;i++)
		{
			for(int j=0;j<=3;j++){
				
			System.out.print(temp[i][j] + "\t");
			}
			System.out.println();
		}
	}

}
