/*
 * Exercise 4, page 172.
 */
package javaprogramming.chapter03;

import java.util.Scanner;

public class Percentages {
	
	public static void main(String[] args){
		double a;
		double b;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Give me a number >>> ");
		a = input.nextDouble();
		System.out.println("Give me another number >>> ");
		b = input.nextDouble();
		
		computePercent(a, b);
		computePercent(b, a);
		
		input.close();
	}
	
	public static void computePercent(double a, double b){
		double result;
		double x;
		
		result = a * 100;
		x = result / b;
		
		System.out.println(a + " is " + x + "% of " + b);
	}
}
