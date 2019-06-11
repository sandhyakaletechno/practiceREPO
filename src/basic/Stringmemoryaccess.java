package basic;

public class Stringmemoryaccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String s= "harsh";
String s1= new String("Harsh");
String s2= "maulik";
String s4= new String("Maulik");
System.out.println("11"+s.equals(s1));
System.out.println("12"+s1==s);
s=s1;
System.out.println("13"+s.equals(s1));
System.out.println("14"+s1==s);
System.out.println("15"+s2==s4);
System.out.println("16"+s2==s);
System.out.println("17"+s2==s4);
System.out.println("18"+s.equalsIgnoreCase(s1));
System.out.println("19"+s1==s4);
s1=s4;
System.out.println("20"+s1==s);	
System.out.println("21"+s.equals(s1));

	
	
	}

}
