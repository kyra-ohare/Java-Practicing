/*
 * Exercise 5, page 172.
 */
package javaprogramming.chapter03;

import java.util.Scanner;

public class GasPrices {
	public static void main(String[] args){
		double pricePerBarrel;
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Price per Barrel: ");
		pricePerBarrel = input.nextDouble();
		
		if(input != null)
			input.close();
		
		System.out.println("The price at the pump is between " + minPrice(pricePerBarrel) + " and " + maxPrice(pricePerBarrel));
	}
	
	public static double minPrice(double a){
		a *= 0.035;
		return a;
	}
	
	public static double maxPrice(double a){
		a *= 0.04;
		return a;
	}
}
