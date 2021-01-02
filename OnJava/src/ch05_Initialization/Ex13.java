//package Ch05_Initialization;

import java.util.*;

class Cup {
	Cup(int marker) {
			System.out.println("Cup(" + marker + ")");
	}

	void f(int marker) {
			System.out.println("f(" + marker + ")");
	}
}

class Cups {
	static Cup cup1;
	static Cup cup2;
	static {
		cup1 = new Cup(1);
		cup2 = new Cup(2);
	}
	Cups() {
		System.out.println("Cups()");
	}
}

public class Ex13{	
	public static void main(String[] args) {	
		System.out.println("Inside main()");
		// Cups.cup1.f(99); // (1)
	
		System.out.println("End of main");
		System.out.println("\n");
	
	// System.out.printlnArray(new Object[]{ new Integer(47), new Float(3.14), new Double(11.11)});
	// System.out.printlnArray(new Object[]{"one", "two", "three" });
	// System.out.printlnArray(new Object[]{new A(), new A(), new A()});
	}
	static Cups cups1 = new Cups(); // (2)
	static Cups cups2 = new Cups(); // (2)

}