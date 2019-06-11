import java.util.Arrays;

public class SortString {
static 	int cnt0;
static int cnt1;
static int cnt2;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//String s = "010201010100222112";
		//char[] array = s.toCharArray();
		
		int[] s= {0,1,0,2,0,1,0,1,0,1,0,0,2,2,2,2,1,1,2};
		//String[] a = {};
		Arrays.sort(s);
		//Arrays.sort(array, 3, 9);
		//System.out.println(array);
		
		for(int i=0;i<s.length;i++){
			//int number = Integer.parseInt(array[i]);
			if(s[i]==0){
				cnt0++;
						}
			if(s[i]==1){
				cnt1++;
						}
			if(s[i]==2){
				cnt2++;
						}
			
			
		}
		System.out.println("freq of 0:"+cnt0+"freq of 1:"+cnt1+"freq of 2:"+cnt2);
		
		
		
		
		
		
		
		
		
		
		
	}

}
