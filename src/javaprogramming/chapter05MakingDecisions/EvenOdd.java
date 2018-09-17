/*
 * Exercise 1, page 291.
 */
package javaprogramming.chapter05MakingDecisions;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer number >>>");
		int number = input.nextInt();
		number %= 2;
		
		if(number == 0)
			System.out.println("This number is even");
		else
			System.out.println("This number is odd");
		
		if(input != null)
			input.close();
	}

}
