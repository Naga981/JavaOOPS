package subclass;
import superclass.Interface1;

public class SubInterface2 implements Interface1 {

	public static void main(String[] args) {
		System.out.println("This is interface implementation");
		SubInterface2 s1 = new SubInterface2();
		s1.m1(); s1.m2(); s1.m3();
	}

	@Override
	public void m1() {
		System.out.println("This is interface2 - m1");
	}

	@Override
	public void m2() {
	    System.out.println("This is interface2 - m2");
	}

    public void m3() {
        // TODO Auto-generated method stub
        System.out.println("This is interface2 - m3");        
    }

}
