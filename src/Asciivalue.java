
public class Asciivalue {
//A to Z = 65 to 90
	//a to z = 97 to 122
	//0 to 9 = 48 to 57
	public static void main(String[] args) {
		String s="09asub53od73thz";
		char[] array = s.toCharArray();
		for(int i=0;i<array.length;i++){
			int  asc = array[i];
			//System.out.println(asc);
		if(asc>=97 && asc<=122)
			System.out.print(array[i]);
		}
	
	
	
	
	
	}

}
