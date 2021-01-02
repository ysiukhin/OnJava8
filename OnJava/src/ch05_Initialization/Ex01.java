//package Ch05_Initialization;

import java.util.*;
public class Ex01{
	String str;

	public static void main(String[] args) {	
		Ex01 test = new Ex01();
		System.out.println("str - is String object declared but do not inialized");
		System.out.println("str = " + test.str);

		// String[] strArr = new String[] {"one", "two", "three", "four"};
		// for (String str : strArr)
		// 	System.out.println(str);
	
	// printArray(new Object[]{ new Integer(47), new Float(3.14), new Double(11.11)});
	// printArray(new Object[]{"one", "two", "three" });
	// printArray(new Object[]{new A(), new A(), new A()});
	}
}