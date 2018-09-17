/*
 * Exercise 3, page 343.
 */

package javaprogramming.chapter06Looping;

import java.util.Scanner;

public class Factorials {

	public static void main(String[] args) {
		int number;
		int originalNumber;
		final int QUIT = 0;
		Scanner input = new Scanner(System.in);
		
		do {
		int factorial = 1;
		System.out.println("Enter a positive integer or 0 to quit...");
		number = input.nextInt();
		originalNumber = number;
		
			while(number >= 1) {
				System.out.print(number + " ");
					factorial *= number;
			number--;
			}
		
		System.out.println("\nFactorial of " + originalNumber + " = " + factorial);
		
		} while(originalNumber != QUIT);
		
		System.out.println("Good-Bye!");
		
		input.close();
	}
}
