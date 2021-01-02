package ch05_Initialization;
import java.util.*;

public class Ex22{	
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
		for ( PaperCurranciesValues currancyValue : PaperCurranciesValues.values()) {
			switch(currancyValue){
				case ONE: 
					print( "One dollar", " ordinal ", (""+currancyValue.ordinal())); break;
				case TWO: 
					print( "Two dollars", " ordinal ", (""+currancyValue.ordinal())); break;
				case FIVE: 
					print( "Five dollars", " ordinal ", (""+currancyValue.ordinal())); break;
				case TEN: 
					print( "Ten dollars", " ordinal ", (""+currancyValue.ordinal())); break;
				case TWENTY: 
					print( "Twenty dollars", " ordinal ", (""+currancyValue.ordinal())); break;
				case FIFTY: 
					print( "Fifty dollars", " ordinal ", (""+currancyValue.ordinal())); break;
			}
		}

		System.out.println("\n------------- End of main ----------------\n");
		
	}
}