package questions;


import java.util.Arrays;
import java.util.List;

public class ChekNumInArrayUsingList {
	public static boolean contains(int[] arr, int m ){
		//List<Integer> al = new ArrayList<Integer>();
		List <int[]> a = Arrays.asList(arr);
		
		
		return a.contains(m);
	}
	public static void main(String[] args) {
		int[] arr = {11,12,13,14,15,16};
		

		System.out.println(contains(arr,12));//false-ans is wrong here.....
		System.out.println(contains(arr,17));//false

	}

}
