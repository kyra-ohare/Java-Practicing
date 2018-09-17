/*
 * Exercise 2, page 343.
 */
package javaprogramming.chapter06Looping;

import java.util.Scanner;

public class EvenEntryLoop {

	public static void main(String[] args) {
		int user;
		final int QUIT = 0;
		Scanner input = new Scanner(System.in);
		
		do {
			System.out.println("Enter any integer or 0 to quit...");
			user = input.nextInt();
			
			if(user % 2 == 0) 
				System.out.println("Good job!");
			else
				System.out.println("Try again!");
			
		} while(user != QUIT);
		
		System.out.println("Good-Bye!");
		input.close();
	}

}
