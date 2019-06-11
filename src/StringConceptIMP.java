
public class StringConceptIMP {

	public static void main(String[] args) {
		String str1= new String("Apple");
        String str2= new String("Chocolate");
        String str3= new String("Apple");
        String str4=  "Chocolate";

        System.out.println("1--str1 equals to str2:"+str1.equalsIgnoreCase(str2));
        System.out.println("2--str1 equals to str3:"+str1.equalsIgnoreCase(str3));
        System.out.println("3--str1 equals to str3:????"+ (str1==str3));//mem not same/new mem for every object
        System.out.println("4--str2 equals to str4:"+ str2.equalsIgnoreCase(str4));
        System.out.println("5--str2 equals to str4:"+ (str2==str4));
        //System.out.println("6--str1 equals to Welcome:"+str1.equalsIgnoreCase("Welcome"));
    }

	}


