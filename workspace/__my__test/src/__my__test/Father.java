package __my__test;

public class Father extends Grandfather{	
	int fatheer=10;
	 void print(){
		System.out.println("FatherClass");
	}
	void funFather(){
		super.print();
		this.print();
		
	}
	
}
