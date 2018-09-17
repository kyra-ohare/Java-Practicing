/*
 * Exercise 6, page 172.
 */
package javaprogramming.chapter03;

import java.util.Scanner;

public class MetricConversion {
	public static void main(String[] args){
		double value;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter a value: ");
		value = input.nextDouble();
		
		System.out.println("The value of " + value + " inch is: " + inch(value) + " and in gallon is " + gallon(value) + ".");
		
		if(input != null)
			input.close();
	}
	
	public static double inch(double a){
		a *= 2.54;
		return a;
	}
	
	public static double gallon(double a){
		a *= 3.7854;
		return a;
	}
}
