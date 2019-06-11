import java.util.Iterator;
import java.util.LinkedList;

public class CollectionDemo1 {

	public static void main(String[] args) {
		LinkedList<Integer> li = new LinkedList<Integer>();
		li.add(11);
		li.add(12);
		li.add(13);
		
		System.out.println(li);
		Iterator itr = li.descendingIterator();
	while(itr.hasNext()){
		System.out.println(itr.next());
	}
	}

}
