//package Ch05_Initialization;

import java.util.*;

public class Ex16{	
	public static void main(String[] args) {	
		System.out.println("\n------------- Inside main() ----------------\n");
		
		String[] strArr = new String[] {"one", "two", "three", "four", "five",};

		for(String str : strArr)
			System.out.println(str);

		System.out.println("\n------------- End of main ----------------\n");
		
	// System.out.printlnArray(new Object[]{ new Integer(47), new Float(3.14), new Double(11.11)});
	// System.out.printlnArray(new Object[]{"one", "two", "three" });
	// System.out.printlnArray(new Object[]{new A(), new A(), new A()});
	}
}