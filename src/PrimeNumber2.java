
public class PrimeNumber2 {
    static void primeCheck(){
    	int status = 0;
    	int j=0;
    	String number="";
    	for( j=2;j<=100;j++){
    	for(int i=2;i<=j/2;i++){
    		if(j%i==0){
    			//System.out.println(j+"is not prime number");
    			status=1;
    			break;
    		}
    	}
    	if(status==0){
    		//System.out.println(num+"is a prime number");
    	number=number+j+"";
    	
    	}
    	}
    	System.out.println("prime numbers are:"+number);
    }
	public static void main(String[] args) {
		/*for(int i=2;i<=100;i++){
		primeCheck(i);
		}*/
		primeCheck();
		
	}

}
