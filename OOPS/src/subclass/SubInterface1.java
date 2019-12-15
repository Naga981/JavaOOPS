package subclass;
import superclass.Interface1;

public class SubInterface1 implements Interface1 {

	public static void main(String[] args) {
		System.out.println("This is interface implementation");
		SubInterface1 s1 = new SubInterface1();
		s1.m1(); s1.m2(); Interface1.m3(); s1.m4(); 
	}

	@Override
	public void m1() {
		System.out.println("m1");
	}

	@Override
	public void m2() {
	System.out.println("m2");
	}

}
