/*
 * Exercise 5, page 343.
 */

package javaprogramming.chapter06Looping;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Knots {
	static int knot = 1;
	static double km = 1.852;
	static double mile = 1.151;
	static byte user;
	static DecimalFormat df = new DecimalFormat("#.##");
	
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Which speed would you like to see?\n1: Knot;\n2: Km;\n3: Mile;\n4: for all.");
		user = input.nextByte();
		input.close();
		
		switch(user) {
		case 1:
			knot();
			break;
		case 2:
			km();
			break;
		case 3:
			mile();
			break;
		case 4:
			knot();
			km();
			mile();
			break;
		default:
			System.out.println("Invalid entry");
		}
	}
	public static void knot() {
		System.out.print("knot: ");
		for(int i = 15; i <= 30; ++i) {
			System.out.print(i + " ");
		}
		System.out.println();
	}
	public static void km() {
		System.out.print("km: ");
		double convert1 = km * 15;
		double convert2 = km * 30;
		for(double i = convert1; i <= convert2; i += 1.852) {
			System.out.print(df.format(i) + " ");
		}
		System.out.println();
	}
	public static void mile() {
		System.out.print("mile: ");
		double convert1 = mile * 15;
		double convert2 = mile * 30;
		for(double i = convert1; i <= convert2; i += 1.15) {
			System.out.print(df.format(i) + " ");
		}
		System.out.println();
	}
}
