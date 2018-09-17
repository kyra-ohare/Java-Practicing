/*
 * Exercise 8, page 113.
 */
package javaprogramming.chapter02;

import java.util.Scanner;

public class Eggs {

	public static void main(String[] args) {
		double dozen = 3.25;
		double individual = 0.45;
		int perDozen = 12;
		double dozens;
		double leftover;
		double total;
		int user;
		Scanner input = new Scanner(System.in);
		
		System.out.println("How many eggs?");
		user = input.nextInt();
		dozens = user / perDozen;
		leftover = user % perDozen;
		double round = Math.ceil(leftover);
		total = (dozens * dozen) + (round * individual);
		
		System.out.println("You ordered " + user + " eggs. That's " + dozens + " dozen at �" + dozen +" per dozen and " + round + " loose eggs at " + individual + " cents each for a total of $" + total + ".");
		input.close();
	}

}
