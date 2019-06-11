
public class ReverseString {

	public static void main(String[] args) {
		/*String str = "Good Morning";
		String a = "";
		for(int i=str.length()-1;i>=0;i--){
			//a+=str.charAt(i);
			a=a+str.charAt(i);
		}*/
		
		StringBuffer a = new StringBuffer("I LIKE CHERRY VERRY MUCH");
		a.reverse();
		System.out.println(a);
	}

}
