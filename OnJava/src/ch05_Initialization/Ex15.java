//package Ch05_Initialization;

import java.util.*;

class Strs {
	static int strsId;
	int id;
	String str1 = "str1 initialized";
	String str2;
	{
		str1 = new String("str1");
		str2 = new String("str2");
		System.out.println(str1 + " and " + str2 + " are initialized inside instance block");
	}

	Strs() {
		id = ++strsId;
		System.out.println("Default constructor. Object ID = " + id + "\n\n");	
	}

	Strs(String str1, String str2) {
		id = ++strsId;
		System.out.println("str1 and str2 are reinitialized");
		this.str1 = new String(str1);
		this.str2 = new String(str2);
		System.out.println("String args constructor object with ID = " + id + "\n\n");
	}

	public String toString(){
		return "str1 = " + str1 + "   and str2 = " + str2 + "\n";
	}
}

public class Ex15{	
	public static void main(String[] args) {	
		System.out.println("\nInside main()\n");
		
		Strs s1 = new Strs();
		Strs s2 = new Strs("str1 constructor","str2 constructor");

		System.out.println("Object ID = "+s1.id+"   s1 = " + s1);
		System.out.println("Object ID = "+s2.id+"   s2 = " + s2);

		System.out.println("End of main");
		System.out.println("\n");
		
	// System.out.printlnArray(new Object[]{ new Integer(47), new Float(3.14), new Double(11.11)});
	// System.out.printlnArray(new Object[]{"one", "two", "three" });
	// System.out.printlnArray(new Object[]{new A(), new A(), new A()});
	}
}