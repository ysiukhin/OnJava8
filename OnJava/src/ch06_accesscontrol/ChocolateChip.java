//package ch06_accesscontrol;
import ch06_accesscontrol.desert.*;
//import java.util.*;


public class ChocolateChip extends Cookie2 {	

	public ChocolateChip() {
		System.out.println("ChocolateChip default constructor");
	}

	public void chomp() {
		bite(); // Can’t access bite
	}


 	public static void main(String ... args) {	
		System.out.println("\n------------- Inside main() ----------------\n");
		
		ChocolateChip x = new ChocolateChip();
		x.chomp();
		System.out.println("\n------------- End of main ----------------\n");		
	}
}