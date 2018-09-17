/*
 * Exercise 9, page 113.
 */
package javaprogramming.chapter02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class DogBoarding {

	public static void main(String[] args) {
		double cost = 2.5;
		int kilo;
		int day;
		double total;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Welcome to Happy Yappy Kennel.\nPrice per kilo is " + cost + ". What's your dog's weight?");
		kilo = input.nextInt();
		System.out.println("How many days?");
		day = input.nextInt();
		total = cost * kilo * day;
		DecimalFormat df = new DecimalFormat("#.##");
		System.out.println("Your dog has " + kilo + " kilos and will stay " + day + " days. Total �" + df.format(total));
		input.close();
	}

}
