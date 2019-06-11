package StringPrograms;

public class ConstructorCallCount {
	static int cnt=0;
	private ConstructorCallCount(int x,int y)
	{
		int Sum=x+y;
		 cnt++;
	}
	
	public static void main(String[] args) {
		ConstructorCallCount c1= new ConstructorCallCount(2,4);
		ConstructorCallCount c2= new ConstructorCallCount(5,6);
		System.out.println(c1.cnt);
		
		
	}

}
