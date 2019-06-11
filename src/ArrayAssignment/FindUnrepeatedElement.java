package ArrayAssignment;

public class FindUnrepeatedElement {

	public static void main(String[] args) {
		int input[] = {1,1,2,2,3,4,4,5,5};
		for(int i=0;i<input.length-1;i++){
			if(input[i]==input[i+1])
				i++;
			else System.out.println(input[i]);
		}

	}

}
