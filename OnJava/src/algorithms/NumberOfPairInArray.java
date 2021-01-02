package algorithms;
//import java.util.*;
/*
	TODO:
		Write java function which calculates number of pairs in array. 
		Pair is when two numbers added together, result is zero.
*/

public class NumberOfPairInArray{

	public static int findPairsQuantity(int ... arr) {
		int pairQuantity = 0;
		for(int i = arr.length - 1; i > 0; i--) {

			if ((arr[i] + arr[i-1]) == 0) {
				System.out.println("arr[i] = "+arr[i]+" and arr[i-1] = "+arr[i-1]);
				pairQuantity++ ;
			}
		}
		return pairQuantity;
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

		System.out.println("Pairs quantity is = " + findPairsQuantity(array.getBaseArrayElements()));

		System.out.println("\n------------- End of main ----------------\n");
		
	}
}