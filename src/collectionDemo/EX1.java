package collectionDemo;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class EX1 {

	public static void main(String[] args) {
		List<Integer>marks = new ArrayList<Integer>();
		marks.add(40);
		marks.add(90);
		marks.add(51);
		
		marks.add(32);
		marks.add(33);
		marks = marks.stream().filter(item-> item<36).map(item -> item+4).collect(Collectors.toList());
		
		//after filter add 4 marks as grace 
		//Predicate p;
		System.out.println(marks);
		
		
		
		
		
		
	}

}
