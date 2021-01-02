//package Ch05_Initialization;

import java.util.*;
class Tank {
	boolean isTankEmpty;
	int tankNumber;

	Tank(int tankNumber) {
		isTankEmpty = false;
		this.tankNumber = tankNumber;
	}

	protected void finalize() {
		if (!isTankEmpty) {
			System.out.println("ATTENTION !!! \b Tank number " + tankNumber + " is not empty, start to empty");
			emptyTank();
		} 
		System.out.println("Tank number "+ tankNumber + " can be destoyed");
	}

	void emptyTank() {
		isTankEmpty = true;
//		System.out.println("Tank number "+ tankNumber + " is empty");
	}
}
public class Ex12{
	
	public static void main(String[] args) {	
		Tank t1 = new Tank(2525);
		Tank t2 = new Tank(2929);
		Tank t3 = new Tank(3131);

		new Tank(0000);
		new Tank(1111).emptyTank();

		t1.emptyTank();
		t2 = t1;
		t3 = null;

		System.gc();
		System.runFinalization();

		System.out.println("End of main");
		System.out.println("\n");
	
	// printArray(new Object[]{ new Integer(47), new Float(3.14), new Double(11.11)});
	// printArray(new Object[]{"one", "two", "three" });
	// printArray(new Object[]{new A(), new A(), new A()});
	}
}