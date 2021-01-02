package ch05_Initialization;
import java.util.*;

public class Ex23{	
	enum PaperCurranciesValues { ONE, TWO, FIVE, TEN, TWENTY, FIFTY };
	static void print(String ... strs) {
		for (String str : strs) {
			System.out.print(str);
		}
		System.out.println();
	}

	public static void main(String ... args) {	
		System.out.println("\n------------- Inside main() ----------------\n");
		PaperCurranciesValues cur1 = PaperCurranciesValues.TEN;
		
		System.out.println("----   "+cur1.toString()+"    ----");

		System.out.println("\n------------- End of main ----------------\n");
		
	}
}