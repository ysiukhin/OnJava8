package algorithms;
import java.util.*;

class BaseArray {
	private static int defaultArraySize = 50;

	private int elemntMaxValue = 20;
	private int[] array;

	// Default constructor
	BaseArray() {
//		System.out.println("Default constructor defaultArraySize = " + defaultArraySize);
		this(defaultArraySize);
	}

	// Constructor with elements quantity
	BaseArray(int elementsQuantity) {
		array = new int[elementsQuantity];
		fillUpArray();
	}

	// Constructor with elements quantity and elemntMaxValue
	BaseArray(int elementsQuantity, int elemntMaxValue) {
		this(elementsQuantity);
		this.elemntMaxValue = elemntMaxValue;
	}

	// Fill up array by random test data
	private void fillUpArray() {
		Random randObj = new Random();		
		int elementsQuantity = array.length;
		while(elementsQuantity > 0) {
			array[elementsQuantity---1] = randObj.nextInt(elemntMaxValue)*((randObj.nextBoolean())? 1: -1);
		}
	}

	public String toString() {
		return Arrays.toString(array);
	}

	public int getBaseArrayLength() { return array.length; }
	public int[] getBaseArrayElements() { return array.clone(); }
	public int getBaseArrayElement (int index) { return array[index]; }
}
