package StringPrograms;

public class MaxOccuringWord {

	public static void main(String[] args) {
		String s="hello nikhil hello nilesh hello anjani hello";
		String[] a= s.split(" ");
		int cnt=0;
		int i;
		int j;
		for( i=0;i<6;i++){
			for( j=1;j<6;j++){
				if(a[i]==a[j+1]){
					cnt++;
				
			}
		}

	}
		System.out.println("max occuring word is:"+a[i]+" "+cnt+"times");

}
}