package collectionDemo1;

import java.util.HashSet;

public class Test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
HashSet s = new HashSet();
	s.add(new Animal());
	s.add(new Animal());
	for(Object a: s){
		System.out.println(a);
	}
	
	
	}

}
