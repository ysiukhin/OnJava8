//package Ch05_Initialization;

import java.util.*;

class A {}

public class Test{

	static void printArrayOld(Object[] args) {
		for(Object obj : args)
			System.out.print(obj + " ");
		System.out.println();
	}

	static void printArrayNew(Object ... args) {
		for(Object obj : args)
			System.out.print(obj + " ");
		System.out.println();
	}

	public static void main(String[] args) {	
		
		printArrayNew(new Integer(47), new Float(3.14), new Double(11.11));
		printArrayNew("one", "two", "three");
		printArrayNew(47, 3.14f, 11.11d);
		printArrayNew(new A(), new A(), new A());

		printArrayNew(new Object[]{ new Integer(47), new Float(3.14), new Double(11.11)});
		printArrayNew();

	// printArray(new Object[]{ new Integer(47), new Float(3.14), new Double(11.11)});
	// printArray(new Object[]{"one", "two", "three" });
	// printArray(new Object[]{new A(), new A(), new A()});
	}
}