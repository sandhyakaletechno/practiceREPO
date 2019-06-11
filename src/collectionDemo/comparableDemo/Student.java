package collectionDemo.comparableDemo;

public class Student implements Comparable<Student> {
	//if sorting needs to be done on single value then use comparable interface
	// if we want sorting on multiple values then use compARATIVE INTERFACE
	int rno;
	String name;
	
	
	public Student(int rno, String name) {
		super();
		this.rno = rno;
		this.name = name;
	}


	/* (non-Javadoc)
	 * @see java.lang.Comparable#compareTo(java.lang.Object)
	 */
	@Override
	public int compareTo(Student o) {
		/*if(this.rno> o.rno)
		return 1;
		else if(this.rno< o.rno)
			return -1;
		else
			return 0;	*/
		//Maulik;
		//maulik;M-m=32 will bw returned
		return this.name.compareTo(o.name);//a=97;A=65;Z=90;z=122;a-A=32;
	//this is sorting based on string
	}
	
	
	public String toString(){
		
		
		return this.rno+"-->"+this.name;
	}
	
	
	
	
	

}
