package subclass;
import superclass.Super1;

class Sub2 extends Super1{
	
	public static void main(String[] arg) {
		System.out.println("Subclass with - extends - Sub2 object");
		Sub2 z = new Sub2();
		z.m3(); z.m1(); z.m5(); Super1.m6();
	}
	
	void s1() {
		m1(); m3(); m5(); m6();
	}
	
	@Override
	public void m1() {
		System.out.println("This is override method");
		super.m1();
	}
}