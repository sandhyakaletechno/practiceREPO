package abstractdemo;

public class B implements A{

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		//A a = new B();//with default
		//a.m3();
	A.m3();//with static
	}

	//@Override
	public void m3(){
		System.out.println("B m3");
		
	}
}
