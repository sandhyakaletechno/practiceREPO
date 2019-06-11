package collectionDemo;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListQ1 {

	public static void main(String[] args) {
		LinkedList<Integer> li= new LinkedList<Integer>();
	li.add(1);
	li.add(34);
	li.add(9);
	System.out.println(li);
	
	Iterator itr= li.descendingIterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
		
		
		
		
	}
	
	
	}

}
