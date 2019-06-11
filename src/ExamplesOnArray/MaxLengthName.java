package ExamplesOnArray;

public class MaxLengthName {
	
	static void getMaxLengthName(String[] input){
		int max=0;
		int index=0;
		String maxname="";
		for(int i=0;i<input.length;i++){
			System.out.println(input[i]+":"+ input[i].length());
			if(max<input[i].length()){
				max=input[i].length();
				maxname=input[i];
				index=i;
			}
		}
		System.out.println("max length name is:"+ maxname+" and length is:"+max+"index is:"+index);
	}
		
	public static void main(String[] args) {
		// TODO Auto-generated method stub
   
		String[] names = {"Ayush","Jeevika","sanjay","sujay","sandhyaaa"};
		getMaxLengthName(names);
		
		
	}

}
