
public class CollectionDemo2 {
	
	
	public static int freqSingleChar(String input, char ch){
		//System.out.println(input);
		//System.out.println(ch);
		char[] InputArray = input.toCharArray();//converted into char array from string
		//System.out.println(InputArray[3]);
		int cnt = 0;
		for(int i=0; i<InputArray.length;i++){
			//System.out.println(InputArray[i]);
			if(InputArray[i]==ch){
				//System.out.println(InputArray[i]);
			cnt++;
			}
		}
		return cnt;
	}

	public static void main(String[] args) {
		String msg = "Hello this is Technocredits";
		//what is freq of i(imp)
		// freq of each char(imp)
		
		int cnt =freqSingleChar(msg, 'e');
		System.out.println(cnt);
		
		
	}

}
