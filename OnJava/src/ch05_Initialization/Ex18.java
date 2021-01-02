//package Ch05_Initialization;

import java.util.*;


public class Ex18{	
	Ex18(String str) {
			System.out.println(str);
	}

	public static void main(String[] args) {	
		System.out.println("\n------------- Inside main() ----------------\n");

		Ex18 [] Ex18Arr = new Ex18[5];
		Ex18Arr[0] = new Ex18("zero");
		Ex18Arr[1] = new Ex18("one");
		Ex18Arr[2] = new Ex18("two");
		Ex18Arr[3] = new Ex18("three");
		Ex18Arr[4] = new Ex18("four");
//		Ex18Arr[5] = new Ex18("five");

		System.out.println("\n------------- End of main ----------------\n");
		
	// System.out.printlnArray(new Object[]{ new Integer(47), new Float(3.14), new Double(11.11)});
	// System.out.printlnArray(new Object[]{"one", "two", "three" });
	// System.out.printlnArray(new Object[]{new A(), new A(), new A()});
	}
}