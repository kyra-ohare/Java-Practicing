/*
 * Exercise 1, page 436
 */
package javaprogramming.chapter08Arrays;

public class EightInts {
	
	public static void main(String[] args) {
		int[] array = {1990, 1995, 2000, 2005, 2010, 2015, 2020, 2025};
		
		for(int i = 0; i < array.length; ++i)
			System.out.print(array[i] + " ");
		
		System.out.println();
		
		for(int j = (array.length - 1); j >= 0; --j)
			System.out.print(array[j] + " ");
	}
}
