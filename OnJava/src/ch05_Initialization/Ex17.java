//package Ch05_Initialization;

import java.util.*;


public class Ex17{	
	static Ex17[] s1;
	static Ex17[] s2;
	static{
		s2 = new Ex17[5];
	}
	Ex17(String str) {
			System.out.println(str);
	}

	public static void main(String[] args) {	
		System.out.println("\n------------- Inside main() ----------------\n");

		Ex17 [] ex17Arr = new Ex17[5];

		System.out.println("\n------------- End of main ----------------\n");
		
	// System.out.printlnArray(new Object[]{ new Integer(47), new Float(3.14), new Double(11.11)});
	// System.out.printlnArray(new Object[]{"one", "two", "three" });
	// System.out.printlnArray(new Object[]{new A(), new A(), new A()});
	}
}