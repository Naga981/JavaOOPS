package superclass;

public class Super1 {
	//accessModifiers
	public int a = 1;
	private int b = 2;
	protected int c = 3;
	int d = 4;
	final int e = 5;
	static int f = 6;
	
	public void m1() {
		System.out.println("public method:");
		System.out.println(a+"-"+b+"-"+c+"-"+d+"-"+e+"-"+f);		
	}
	
	private void m2() {
		System.out.println("private method:");
		System.out.println(a+"-"+b+"-"+c+"-"+d+"-"+e+"-"+f);		
	}
	
	protected void m3() {
		System.out.println("protected method:");
		System.out.println(a+"-"+b+"-"+c+"-"+d+"-"+e+"-"+f);		
	}
	
	void m4() {
		System.out.println("default method:");
		System.out.println(a+"-"+b+"-"+c+"-"+d+"-"+e+"-"+f);		
	}
	
	public final void m5() {
		System.out.println("public final method:");
		System.out.println(a+"-"+b+"-"+c+"-"+d+"-"+e+"-"+f);	
	}
	
	public static void m6() {
		System.out.println("public static method:");
		System.out.println(f);	
	}
		
	public static void main(String[] a) {
		System.out.println("Super class");
		Super1 s = new Super1(); s.m2();
//		s.m1(); s.m2(); s.m3();	s.m4(); s.m5(); m6();
	}
}
