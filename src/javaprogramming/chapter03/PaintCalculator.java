/*
 * Exercise 7, page 173.
 */
package javaprogramming.chapter03;

import java.util.Scanner;

public class PaintCalculator {
	public static void main(String[] args) {
		int length;
		int width;
		int height;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter length of the room >> ");
		length = input.nextInt();
		System.out.print("Enter width of the room >> ");
		width = input.nextInt();
		System.out.print("Enter height of the room >> ");
		height = input.nextInt();
		
		if(input != null)
			input.close();
		
		wallArea(length, width, height);
	}
	
	public static double wallArea(int l, int w, int h) {
		double area = 2 * h * (l + w);
		System.out.println("The wall area: " + area + " square meters.");
		numberOfGallons(area);
		return area;
	}
	
	public static double numberOfGallons(double a) {
		double oneGallon = 350;
		double gallons = a / oneGallon;
		double gallon = Math.round(gallons);
		System.out.println("Number of gallons: " + gallon);
		paintPrice(gallon);
		return gallon;
	}
	
	public static double paintPrice(double a) {
		double price = 32;
		double total = a * price;
		System.out.println("Total price: " + total);
		return total;
	}
}
