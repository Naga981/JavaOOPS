package subclass;
import superclass.Abstract1;

public class SubAbstract1 extends Abstract1{

	public static void main(String[] args) {
		SubAbstract1 s1 = new SubAbstract1();
		s1.display();
		s1.calculateArea();
	}

	@Override
	public void display() {
		System.out.println("This is SubAbstract");
		super.display();
	}
	
	@Override
	public void calculateArea() {
		System.out.println("welcome");
	}
}
