package StringPrograms;

public class RemoveSpaces {


	public static void main(String[] args) {
		String s = "Krishna___Kanani______Technocredits";
		String temp = "";
//output = Krishna Kanani Technocredits
		//use regx
		//char[] A =  s.toCharArray();
		s = s.replaceAll("//s+"," ");
		System.out.println(s);
/*String [] input = 	s.split(" ");
System.out.println(input.length);
		for(int i=0;i<input.length;i++){
			if(input[i].length()>0)
			{
				if(i!=s.length()-1)
					temp = input[i]+" ";
				else
					temp+=input[i];
			}
				
			
		}*/
	}

}
