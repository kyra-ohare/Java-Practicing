/*
 * Array values are changed in the class.
 * 
 * Notice that in this class, the array name is passed to the method and no brackets are used. In the method header, brackets are used to show that the parameter is an array of integers (a reference) and not a simple int.
 * Compare with PassArrayElement Class.
 */
package javaprogramming.chapter08Arrays;

public class PassArray {

	public static void main(String[] args) {
		final int NUM_ELEMENTS = 4;
		int[] someNums= {5, 10, 15, 20};
		int x;
		
		System.out.print("At start of main: ");
		for(x = 0; x < NUM_ELEMENTS; ++x)
			System.out.print(" " + someNums[x]);
		System.out.println();
		
		methodGetsArray(someNums); //no []
		
		System.out.print("At end of main: ");
		for(x = 0; x < NUM_ELEMENTS; ++x)
			System.out.print(" " + someNums[x]);
		System.out.println();
	}
	
	public static void methodGetsArray(int[] arr) { //we have []
		int x;
		
		System.out.print("At start of method arr holds: ");
		for(x = 0; x < arr.length; ++x)
			System.out.print(" " + arr[x]);
		System.out.println();
		
		for(x = 0; x < arr.length; ++x)
			arr[x] = 888;
		
		System.out.print(" and at end of method arr holds: ");
		for(x = 0; x < arr.length; ++x)
			System.out.print(" " + arr[x]);
		System.out.println();
	}
}
