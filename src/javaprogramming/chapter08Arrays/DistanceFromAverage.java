/*
 * Exercise 2, page 436
 */
package javaprogramming.chapter08Arrays;

import java.util.Scanner;

public class DistanceFromAverage {

	public static void main(String[] args) {
		final int MAX_NUMBER = 10;
		double[] distances = new double[MAX_NUMBER];
		double total = 0;
		final int QUIT = 999;
		String userString;
		double userDouble;
		int counter = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a double >>> ");
		userString = input.nextLine();
		
		if(userString.equals("")) {
			System.out.println("Error - no entry made. Good-Bye.");
		}else {
			userDouble = Double.parseDouble(userString);
			
			while(userDouble != QUIT && counter < MAX_NUMBER) {
				distances[counter] = userDouble;
				total += distances[counter];
				System.out.print("Enter next double or " + QUIT + " to quit >>> ");
				userDouble = input.nextDouble();
				counter++;
			}
			System.out.print("You entered ");
			for(int i = 0; i < distances.length; i++)
				System.out.print(distances[i] + " ");
			total /= counter;
			System.out.println("\nAverage is: " + total);
		}
		
		input.close();
	}

}
