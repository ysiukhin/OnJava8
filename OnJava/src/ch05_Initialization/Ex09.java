//package Ch05_Initialization;

import java.util.*;
public class Ex09{
	String str1 = new String("String initialized at definition");
	String str2;


	public Ex09(){
		this("Default constructor call constructor with String");
		System.out.println("Default constructor end");
	}

	public Ex09(String str){
		System.out.println(str);
	}

	public Ex09(int intVar){
		this("Constructor with int call constructor with String i = " +intVar);
		System.out.println("int constructor finished");
	}

	public static void main(String[] args) {	
		new Ex09();
		new Ex09(47);
		new Ex09("String constructor");
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