/*
 * Exercise 7, page 236.
 */
package javaprogramming.chapter04;

import java.lang.Math;

public class MathTest{
	public static void main(String[] args){
		double squareRoot = 37;
		double sine = 300;
		double cosine = 300;
		double floor = 22.8;
		double ceiling = 22.8;
		double round = 22.8;
		char ch = 'D';
		int num = 71;
		double random1 = 0;
		double random2 = 20;
		
		
		System.out.println("Square root of " + squareRoot + " is " + Math.sqrt(squareRoot));
		System.out.println("Sine of " + sine + " is " + Math.sin(sine));
		System.out.println("Cosine of " + cosine + " is " + Math.cos(cosine));
		System.out.println("Floor of " + floor + " is " + Math.floor(floor));
		System.out.println("Ceiling of " + ceiling + " is " + Math.ceil(ceiling));
		System.out.println("Round of " + round + " is " + Math.round(round));
		System.out.println("Larger and smallest of " + ch + " is " + Math.min(ch, num) + " and " + Math.max(ch, num));
		System.out.println("Random number from " + random1 + " to " + random2 + " is " + 4*Math.random());
	}
}