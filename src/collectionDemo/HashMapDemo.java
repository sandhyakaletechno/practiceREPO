package collectionDemo;

import java.util.HashMap;
import java.util.Set;

public class HashMapDemo {

	
	public static  void hashmap(){
	HashMap<Integer,String> hm = new HashMap<Integer,String>();
	hm.put(1,"sandhya");
	hm.put(2,"sandhya");
	hm.put(3,"sandhya");
	hm.put(4,"sandhya");
Set<Integer>	s = hm.keySet();
		System.out.println(s);
	}

	public static void main(String args[]){
		hashmap();
	}
}
