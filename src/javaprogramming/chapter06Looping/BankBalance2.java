/*
 * Indefinite while Loop
 * 
 * when the value of a loop control variable is not altered by arithmetic, but instead is altered by user input.
 */
package javaprogramming.chapter06Looping;

import java.util.Scanner;

public class BankBalance2 {

	public static void main(String[] args) {
		double balance;
		int response;
		int year = 1;
		final double INT_RATE = 0.03;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Enter initial bank balance > ");
		balance = keyboard.nextDouble();
		keyboard.nextLine();
		
		do {
			balance += balance * INT_RATE; //OR balance = balance + balance * INT_RATE
			System.out.println("After year " + year + " at " + INT_RATE + " interest rate, balance is $" + balance);
			year = year + 1;
			System.out.println("\nDo you want to see the balance at the end of another year?");
			System.out.print("Enter 1 for yes or any other number for no >> ");
			response = keyboard.nextInt();
		} while(response == 1);
		
		keyboard.close();
	}

}
