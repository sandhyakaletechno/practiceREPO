package interviewPrograms;

public class CodePrinting {
//static	char letter; 
static int cnt=1;
public static void main(String[] args) {
	//A1B2C3D4E5....Z26
	//char letter = 65;
	//System.out.println(letter);
	for(int i=1;i<=26;i++){
	char	letter= (char) (64+i);
		System.out.print(letter+""+i);
		
		
	}
	
	
	
	
	
}
}
