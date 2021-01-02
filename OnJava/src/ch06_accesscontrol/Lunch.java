package ch06_accesscontrol;

class Soup1 {
	private Soup1() {}

	public static Soup1 makeSoup() {
		return new Soup1();
	}
}

class Soup2 {
	private static Soup2 soup = new Soup2();
	private Soup2() {}
	public static Soup2 makeSoup() {
		return soup;
	}
	public void f() {}
}
public class Lunch {	

	void testPrivate() {
		// Can't do this - private constructor
		// Soup1 soup = new Soup1();
	}

	void testStatic() {
		Soup1 soup = Soup1.makeSoup();
		System.out.println("Soup1 is maden");
	}

	void testSingleton() {
		Soup2.makeSoup().f();
		System.out.println("Soup2 f() is maden"); 
	}

	public static void main(String ... args) {	
		System.out.println("\n------------- Inside main() ----------------\n");
		
		Lunch l = new Lunch();
		l.testStatic();
		l.testSingleton();

		System.out.println("\n------------- End of main ----------------\n");
		
	}
}