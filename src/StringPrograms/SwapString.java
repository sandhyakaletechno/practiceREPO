package StringPrograms;

public class SwapString {

	public static void main(String[] args) {
	String str1=" Harsh";
	String str2="Maulik";
	
	String str= str1+str2;
	str1= str.substring(str1.length());
	System.out.println("str1="+str1);
	str2= str.substring(0,(str.length()-str1.length()));
	System.out.println("str2="+str2);
	}

}
