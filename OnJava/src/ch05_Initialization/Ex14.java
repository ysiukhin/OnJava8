//package Ch05_Initialization;

import java.util.*;

class Strs {
	String str1 = "str1 initialized";
	String str2;
	{
		str1 = new String("str1 initialized");
		str2 = new String("str2 initialized");
		System.out.println(str1 + " and " + str2 + " are insided inside instance block");
	}

	Strs() {
		System.out.println("Default construcror");	
	}

	Strs(String str1, String str2) {
		System.out.println("String construcror");
		System.out.println("str1 and str2 are reinitialized");
		str1 = new String("ATTENTION !!! str1 reinitialized");
		str2 = new String("ATTENTION !!! str2 reinitialized");
	}

	protected void finalize(){
		System.out.println("str1 and str2 GC() collected");	
	}
}

public class Ex15{	
	public static void main(String[] args) {	
		System.out.println("Inside main()");

		System.gc();
		System.runFinalization():
		System.out.println("End of main");
		System.out.println("\n");
		
	// System.out.printlnArray(new Object[]{ new Integer(47), new Float(3.14), new Double(11.11)});
	// System.out.printlnArray(new Object[]{"one", "two", "three" });
	// System.out.printlnArray(new Object[]{new A(), new A(), new A()});
	}
}