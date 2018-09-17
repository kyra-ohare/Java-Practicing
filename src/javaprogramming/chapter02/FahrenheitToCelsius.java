/*
 * Exercise 11, page 113.
 */
package javaprogramming.chapter02;

import java.util.Scanner;

public class FahrenheitToCelsius {
	static double celsius;
	static double fahrenheit;
	static double user;
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		//toFahrenheit();
		//toCelsius();
		double number;
		number = 12345%7;
		System.out.println(number);
	}
	
	public static void toFahrenheit() {
		System.out.println("Enter a temperature in Celsius...");
		user = input.nextDouble();
		fahrenheit = user * 1.8 + 32;
		System.out.println(user + "�C is " + fahrenheit + "�F.");
	}
	
	public static void toCelsius() {
		System.out.println("Enter a temperature in Fahrenheit...");
		user = input.nextDouble();
		celsius = (user - 32) / 1.8;
		System.out.println(user + "�F is " + celsius + "�C.");
	}
}
