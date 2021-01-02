//package ch06_accesscontrol;
//import ch06_accesscontrol.desert.*;
//import java.util.*;

class Sundae {
	private Sundae() {}

	static Sundae makeASundae() {
		return new Sundae();
	}
}

public class IceCream {	
 	public static void main(String ... args) {	
		System.out.println("\n------------- Inside main() ----------------\n");
		
		// Sundae x = new Sundae();	
		Sundae x = Sundae.makeASundae();

		System.out.println("\n------------- End of main ----------------\n");		
	}
}