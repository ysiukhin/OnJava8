//package Ch05_Initialization;

import java.util.*;


public class Ex20{	
	static void varArgs(String ... strs) {
		System.out.println("Array length = " + strs.length);
		for (String str : strs) {
			System.out.println(str);
		}
		System.out.println();
	}

	public static void main(String ... args) {	
		System.out.println("\n------------- Inside main() ----------------\n");
		varArgs(args);
		// varArgs("", "111", "222","333");
		// varArgs(new String[]{"3333", "2222", "","1111","", "55555"});

		System.out.println("\n------------- End of main ----------------\n");
		
	// System.out.printlnArray(new Object[]{ new Integer(47), new Float(3.14), new Double(11.11)});
	// System.out.printlnArray(new Object[]{"one", "two", "three" });
	// System.out.printlnArray(new Object[]{new A(), new A(), new A()});
	}
}