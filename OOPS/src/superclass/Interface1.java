package superclass;

public interface Interface1 {

	public void m1();
	public void m2();
	
	public static void m3() {
	    System.out.println("this is static interface method");
	}
	public default void m4() {
	    System.out.println("this is default interface method");
	}
}
