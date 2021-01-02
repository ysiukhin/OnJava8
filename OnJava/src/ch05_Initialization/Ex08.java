//package Ch05_Initialization;

import java.util.*;
public class Ex08{
	String str1 = new String("String initialized at definition");
	String str2;

	public void bark(){
		System.out.println("Default bark");
		bark('c');
		this.bark('c');
	}

	public void bark(int intVar, double dobVar){
		System.out.println("Bark with int at first = " + intVar + "and double = " + dobVar);

	}

	public void bark(double dobVar, int intVar){
		System.out.println("Bark with double at first = " + dobVar + "and int = " + intVar);
		
	}

	public void bark(char chVar){
		System.out.println("Bark with ch = " + (int)chVar);
		
	}

	public static void main(String[] args) {	
		Ex08 test = new Ex08();
		test.bark();
		// test.bark(5, 13d);
		// test.bark(13d, 5);
		// test.bark('Y');
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