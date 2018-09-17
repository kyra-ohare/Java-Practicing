/*
 * Exercise 1, page 343.
 */
package javaprogramming.chapter06Looping;

import java.util.Scanner;

public class CountByFives {

	public static void main(String[] args) {
		countByFives();
		countByAnything();
	}
	
	public static void countByFives() {
		int var = 5;
		final int LIMIT = 200;
		
		while(var <= LIMIT) {
			System.out.print(var + " ");
			if(var % 50 == 0) {
				System.out.println();
			}			
			var += 5;
		}
	}
	
	public static void countByAnything() {
		int user;
		final int LIMIT = 200;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter an integer up to " + LIMIT + " to start counting...");
		user = input.nextInt();
		
		while(user <= LIMIT) {
			System.out.print(user + " ");
			if(user % 10 == 0)
				System.out.println();
			user++;
		}
		
		input.close();
	}

}
