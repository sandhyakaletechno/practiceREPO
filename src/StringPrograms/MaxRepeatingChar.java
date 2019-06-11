package StringPrograms;

public class MaxRepeatingChar {

	public static void main(String[] args) {
		int cnt=1;
		int i;
		String s="hello how are you harsh?";
		int A=s.length();//24
		String b1[]=s.replace(" ","").replace("?","").split("");
				
		
		
		for( i=0;i<b1.length-1;i++){
				for(int j=1;j<b1.length;j++){
				if(b1[i]==b1[i+1])
					cnt++;
				
				
				}
		}
		System.out.println(b1[i]+" "+cnt);
					
				
			
		}
		
				
				
				
				
				
				
				
	}



