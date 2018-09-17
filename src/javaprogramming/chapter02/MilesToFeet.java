/*
 * Exercise 4, page 113.
 */
package javaprogramming.chapter02;

import java.util.Scanner;

public class MilesToFeet {
	static int feet = 5280;
	static int mile = 1;
	static double feetToMile = feet * mile;
	static double total;

	public static void main(String[] args) {
		toMyUnclesHouse();
		interactive();
	}
	
	public static void toMyUnclesHouse() {
		double houseToUncles = 8.5;
		total = feetToMile * houseToUncles;
		
		System.out.println("The distance to my uncle's house is " + houseToUncles + " miles or " + total + " feet.");
		System.out.println();
	}
	
	public static void interactive() {
		Scanner input = new Scanner(System.in);
		int user;
		
		System.out.println("Give me a distance in foot...");
		user = input.nextInt();
		total = user /feetToMile;
		
		System.out.println("The distance of " + user + " feet is " + total + " miles.");
		input.close();
	}
}
