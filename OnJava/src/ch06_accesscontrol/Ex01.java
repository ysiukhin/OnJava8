package ch06_accesscontrol;
import java.util.*;

public class Ex01{	
//	enum PaperCurranciesValues { ONE, TWO, FIVE, TEN, TWENTY, FIFTY };
	// static void print(String ... strs) {
	// 	for (String str : strs) {
	// 		System.out.print(str);
	// 	}
	// 	System.out.println();
	// }

	public static void main(String ... args) {	
		System.out.println("\n------------- Inside main() ----------------\n");
		new ch06_accesscontrol.test.TestClassEx01();
		System.out.println("\n------------- End of main ----------------\n");
		
	}
}