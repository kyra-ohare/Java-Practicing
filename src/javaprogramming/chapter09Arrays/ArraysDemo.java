package javaprogramming.chapter09Arrays;

import java.util.Arrays;

public class ArraysDemo {

	public static void main(String[] args) {
		int[] myScores = new int[5];
		display("Original array>>>>>>>>>>>> ", myScores);
		Arrays.fill(myScores, 8);
		display("After filling with 8s>>>>> ", myScores);
		myScores[2] = 6;
		myScores[4] = 3;
		display("After changing two values> ", myScores);
		Arrays.sort(myScores);
		display("After sorting>>>>>>>>>>>>> ", myScores);
	}
	
	public static void display(String message, int array[]) {
		int size = array.length;
		System.out.print(message);
		for(int x = 0; x < size; ++x)
			System.out.print(array[x] + " ");
		System.out.println();
	}

}
