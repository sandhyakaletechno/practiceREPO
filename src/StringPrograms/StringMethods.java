package StringPrograms;

public class StringMethods {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String str1 = "Technocredits";
String str2 = new String("Technocredits");
//String is a class and data type also
Integer i1 = new Integer(12);
//Integer is a wrapper class
int i2 = 12;
//int is a data type
		System.out.println(str1.length());
		
		char ch = str1.charAt(0);
		System.out.println(ch);
		
		for(int i=str1.length()-1;i>=0;i--){
			System.out.print(str1.charAt(i));
		}
		
	int index = str1.indexOf('h');
	System.out.println("\n"+index);
	
	System.out.println(str1.toLowerCase());
	System.out.println(str1.toUpperCase());
	System.out.println(str1);	
	str1 = str1.toUpperCase();//have to capture otherwise print same as original .//because string is immutable
	System.out.println(str1);//in case of sting buffer and builder we dont have to capture same memory pe change hota he
	
	System.out.println(str1.substring(3));
	System.out.println(str1.substring(3,str1.length()));
	
	
	char[] ch1 = str1.toCharArray();
	for(int i=ch1.length-1;i>=0;i--){
		System.out.print(ch1[i]);
	}
	
	
	
	
	
	
	
	
	
	
	}

}
