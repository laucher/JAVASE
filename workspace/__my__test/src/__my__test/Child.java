package __my__test;

public class Child extends Father {
	int fatheer=90;
	void print(){
	System.out.println("Child");
	}
	void funChild(){
		super.print();
		this.print();
	}
}
