//package Ch05_Initialization;

import java.util.*;
public class Ex10{

	protected void finalize(){
		System.out.println("finalize method");

	}
	
	public static void main(String[] args) {	
		new Ex10();
		System.gc();
		System.out.println("End of main");
		System.out.println("\n");
		// System.out.println("str1 - " + test.str1);
		// System.out.println("str2 - " + test.str2);

		// String[] strArr = new String[] {"one", "two", "three", "four"};
		// for (String str : strArr)
		// 	System.out.println(str);
	
	// printArray(new Object[]{ new Integer(47), new Float(3.14), new Double(11.11)});
	// printArray(new Object[]{"one", "two", "three" });
	// printArray(new Object[]{new A(), new A(), new A()});
	}
}