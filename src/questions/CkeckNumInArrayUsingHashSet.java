package questions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

//Write a program to check specific number in an array.
public class CkeckNumInArrayUsingHashSet {
	public static boolean contains(int[] a, int m){
		List<int[]> list = Arrays.asList(a);
		list.contains("");
		Set<Integer> set = new HashSet<Integer>();//how to add array element into set
		
		return set.contains(m);
	}
	
	
	public static void main(String[] args) {
		int[] m= {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		System.out.println(contains(m, 2));
		System.out.println(contains(m, 11));
	}

}
