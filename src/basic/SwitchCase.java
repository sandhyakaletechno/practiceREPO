package basic;

public class SwitchCase {
	static void display(char ch){
		switch(ch){
		case 'A':
			System.out.println("Sunday");
			break;
		case 'B':
			System.out.println("monday");
			break;
		case 'C':
			System.out.println("tuesday");
			break;
			
		case 'D':
			System.out.println("wednesday");
			break;
		case 'E':
			System.out.println("hollyday");
			break;
			
		}
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		display('A');
	}

}
