//package Ch05_Initialization;

import java.util.*;
public class Ex05{
	String str1 = new String("String initialized at definition");
	String str2;

	public boolean print(int intVar){
		System.out.println("Boolean type return " + intVar);
		return true;
	}

	public double print(int intVar){
		System.out.println("Double type return " + intVar);
		return (double) intVar;
	}

	public void bark(){
		System.out.println("Default bark");
	}

	public void bark(int intVar){
		System.out.println("Bark with int = " + intVar);

	}

	public void bark(double dobVar){
		System.out.println("Bark with double = " + dobVar);
		
	}

	public void bark(char chVar){
		System.out.println("Bark with ch = " + (int)chVar);
		
	}

	public static void main(String[] args) {	
		Ex05 test = new Ex05();
		test.bark();
		test.bark(5);
		test.bark(13d);
		test.bark('Y');
		System.out.println("\n");
		boolean boolVar = test.print(47);
		double dobVar = test.print(47); 
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