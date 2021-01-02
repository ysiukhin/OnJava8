import java.util.*;


public class Test{
	private static void  print(String str){
		System.out.println(str);
	}
////////////////	
	static void printArray(Object[] args) {
		for(Object obj : args)
			System.out.print(obj + " ");
		System.out.println();
	}

	public static void main(String[] args) {	
		String[] strArr = new String[] {"one", "two", "three", "four"};
		for (String str : strArr)
			System.out.println(str);
	
	// printArray(new Object[]{ new Integer(47), new Float(3.14), new Double(11.11)});
	// printArray(new Object[]{"one", "two", "three" });
	// printArray(new Object[]{new A(), new A(), new A()});
	}
}