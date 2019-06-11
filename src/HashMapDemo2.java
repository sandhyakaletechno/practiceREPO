import java.util.HashMap;

public class HashMapDemo2 {

	public static void main(String[] args) {
		String str="technocredits";
		
		HashMap<Character,Integer> hm = new HashMap<Character,Integer>();
		for(int i=0;i<str.length();i++){
			//for(String temp: A)
				if(hm.containsKey(str.charAt(i)))
					hm.put(str.charAt(i),hm.get(str.charAt(i))+1);
			else
				hm.put(str.charAt(i),1);
	
		//System.out.println(hm);
		
	}
System.out.println(hm);

	}

}
