/*
 * Exercise 11, page 113.
 */
package javaprogramming.chapter02;

import java.util.Scanner;

public class TicketNumber {
	static double user1;
	static int user2;
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter the first 5 ticket number...");
		user1 = input.nextInt();
		int x = (int) user1;
		System.out.println("Enter the last ticket number...");
		user2 = input.nextInt();
		
		System.out.println("You entered " + x + "-" + user2 + ".\nThis ticket number is " + ticket(user1, user2));
		input.close();
	}
	
	public static boolean ticket(double number1, int number2) {
		double valid;
		valid = number1 % 7;
		
		if(valid == number2)
			return true;
		else
			return false;
	}
}
