//package Ch05_Initialization;

import java.util.*;

public class Ex21{	

	public enum PaperCurranciesValues { ONE, TWO, FIVE, TEN, TWENTY, FIFTY };


	public static void main(String ... args) {	
		System.out.println("\n------------- Inside main() ----------------\n");
		PaperCurranciesValues cur1 = PaperCurranciesValues.TEN;
		for ( PaperCurranciesValues currancyValue : PaperCurranciesValues.values()) {
			System.out.println(currancyValue + " ordinal " + currancyValue.ordinal());
		}

		System.out.println("\n------------- End of main ----------------\n");
		
	// System.out.printlnArray(new Object[]{ new Integer(47), new Float(3.14), new Double(11.11)});
	// System.out.printlnArray(new Object[]{"one", "two", "three" });
	// System.out.printlnArray(new Object[]{new A(), new A(), new A()});
	}
}