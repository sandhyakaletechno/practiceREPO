
public class RemoveCharacter {
	public static String removeChar(String str,char a){
		if( str==null)
		return null;
		//char b=Character.toString(a);
		return str.replaceAll(Character.toString(a),"");
		
		
		
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      System.out.println(removeChar("Chicago",'c'));
	}

}
