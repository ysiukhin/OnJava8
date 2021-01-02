package algorithms;
//import java.util.*;
/*
	TODO:
		Write java function which calculates number of pairs in array. 
		Pair is when two numbers added together, result is zero.
*/

public class DuplicateNumberInArray{

//	 public static int findDublicatedNumber_Arrays_class_methods(int ... arr) {
	public static int findDublicatedNumber(int ... array) {
		for(int i = 0; i < array.length ; i++) {
			for (int j = i + 1; j < array.length; j++)
				if (array[i] == array[j]) { return i; }
		}
	 	return -1;
	 }

	public static void main(String ... args) {	
		BaseArray array;
		
		System.out.println("\n------------- Inside main() ----------------\n");

		if (args.length > 0){
			int arraySize = Integer.parseInt(args[0]);
			if (args.length > 1) {
				
				array = new BaseArray(arraySize, Integer.parseInt(args[1]));
			} 
			else array = new BaseArray(arraySize);
		} 
		else array = new BaseArray();

		System.out.println(array);
		int position = findDublicatedNumber(array.getBaseArrayElements());
		if (position < 0)
			System.out.println("There is no dublicate numbers in array ");
		else
			System.out.println("Dublicate number is " + array.getBaseArrayElement(position));
//		System.out.println("Pairs quantity is = " + findPairsQuantity(array.getBaseArrayElements()));
		System.out.println("\n------------- End of main ----------------\n");
		
	}
}