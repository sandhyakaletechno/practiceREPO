package basic;

public class PrintDefaultValue {
	
 byte s;
 short sh;
 int a;
 long l;

 float f;
 double d;

 char ch;
 boolean b;
 String st;
  void displayValue(){
	System.out.println("byte is:"+ s);
	System.out.println("short is:"+ sh);
	System.out.println("int is:"+ a);
	System.out.println("long is:"+ l);
	System.out.println("float is:"+ f);
	System.out.println("double is:"+ d);
	System.out.println("char is:"+ ch);
	System.out.println("boolean is:"+ b);
	System.out.println("string is:"+ st);
}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintDefaultValue d1=new PrintDefaultValue();
		d1.displayValue();
	}

}
