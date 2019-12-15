package subclass;
import superclass.Super1;

class Sub1{	
	
	public static void main(String[] a) {
		System.out.println("Subclass with - Super1 object");
		Super1 s = new Super1();
		s.m1(); s.m5(); Super1.m6(); 
	}
}
