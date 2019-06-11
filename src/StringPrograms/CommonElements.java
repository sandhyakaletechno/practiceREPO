package StringPrograms;
//find common elements from int array.
public class CommonElements {

	public static void main(String[] args) {
		int a[]={5,9,2,3,6};
		int b[]={2,5,8,4,6};
		for(int i=0;i<a.length;i++){
			
			for(int j=0;j<b.length;j++){
				if(a[i]==b[j])
					System.out.println(a[i]);
			}
		}
	
		
		
		
		
	}

}
