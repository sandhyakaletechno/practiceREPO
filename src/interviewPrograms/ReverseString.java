package interviewPrograms;

public class ReverseString {

	public static void main(String[] args) {
		String actual= "Selenium Web Driver is open source tool";
		String expected = "tool source open is Driver Web Selenium";
	String[] array = actual.split(" ");
	for(int i=array.length-1;i>=0;i--){
		System.out.print(array[i]+" ");
	}
	
	
	
	
	
	}
}
