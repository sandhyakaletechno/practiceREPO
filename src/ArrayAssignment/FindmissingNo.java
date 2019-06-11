package ArrayAssignment;

public class FindmissingNo {
	
   
    public static void main(String args[]) 
    { 
        int a[] = {1,2,4,5,6,7,8,9,10}; 
       for(int i=0;i<a.length-1;i++){
    	   if(a[i+1]!=a[i]+1)
    		   System.out.println("missing no is"+(a[i]+1));
       }
}
}