/*
 * Exercise 6, page 113.
 */
package javaprogramming.chapter02;

import java.util.Scanner;

public class InchesToFeet {
	static int feet = 1;
	static int inch = 12;
	static int user;
	static Scanner input = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		inchToFeet();
		feetToInches();
	}
	
	public static void inchToFeet() {
		System.out.println("Give me a value in inch...");
		user = input.nextInt();
		feet = user / inch;
		int leftover = user % inch;
		System.out.println(user + " inches = " + feet + " feet and " + leftover + " inches.");
	}
	public static void feetToInches() {
		System.out.println("Give me a value in feet...");
		user = input.nextInt();
		feet = user * inch;
		System.out.println(user + " feet = " + feet + " inches.");
	}
}
