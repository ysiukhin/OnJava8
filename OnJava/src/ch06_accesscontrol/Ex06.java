package ch06_accesscontrol;
class TestProtected {
	protected void f() {
		System.out.println("Class TestProtected protected methode f()");
	}
}

public class Ex06 {	

	public static void main(String ... args) {	
		System.out.println("\n------------- Inside main() ----------------\n");
		TestProtected t = new TestProtected();
		t.f();
//		t.testProtected();
		System.out.println("\n------------- End of main ----------------\n");
		
	}
}