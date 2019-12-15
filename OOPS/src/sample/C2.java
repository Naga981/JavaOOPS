package sample;

public class C2 {
	
public static void main(String[] args) {
	C2 a = new C2();
	a.m1();	a.m2(); a.m3();
	C3 b = new C3();
    b.m1();
}

public void m1() {
	System.out.println("this is m1");
}

    void m2() {
	System.out.println("this is m2");
}
    
private void m3() {
    System.out.println("this is m3");
    }
}


 class C3 {
     public void m1() {
         System.out.println("this is c3m1");
     }
}
