import java.util.HashMap;
public class HashMapDemo {

	public static void main(String[] args) {
		String str="hello technocredits hi technocredits hello";
		String[] A =str.split(" ");
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		for(int i=0;i<A.length;i++){
			//for(String temp: A)
				if(hm.containsKey(A[i]))
					hm.put(A[i],hm.get(A[i])+1);
			else
				hm.put(A[i],1);
	
		//System.out.println(hm);
		
	}
System.out.println(hm);
}
}
