package coreJavaAssignment;

public class InheritanceDemo2 extends InheritanceDemo1 {

	public static void operation(){
		System.out.println("operation of Demo2");
	}
	
	public static void operation1(){
		System.out.println("operation1 of Demo2");
	}
	
	public static void operation2(){
		System.out.println("operation2 of Demo2");
	}
	
	
	
	
	public static void main(String[] args){
		InheritanceDemo2 demo = new InheritanceDemo2();
		demo.operation1();
		demo.operation3();
		
	}
}
