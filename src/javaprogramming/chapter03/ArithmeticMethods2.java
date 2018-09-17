/*
 * Exercise 3b, page 172.
 */
package javaprogramming.chapter03;

import java.util.Scanner;

public class ArithmeticMethods2 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.print("Enter an int >> ");
		int a = input.nextInt();
		System.out.print("Enter another int >> ");
		int b = input.nextInt();
		input.close();
		
		displayNumberPlus10(a, b);
		displayNumberPlus100(a, b);
		displayNumberPlus1000(a, b);
		
	}
	
	public static void displayNumberPlus10(int a, int b) {
		int c = a + 10;
		int d = b + 10;
		System.out.println(a + " + 10 = " + c);
		System.out.println(b + " + 10 = " + d);
	}
	
	public static void displayNumberPlus100(int a, int b) {
		int c = a + 100;
		int d = b + 100;
		System.out.println(a + " + 100 = " + c);
		System.out.println(b + " + 100 = " + d);
	}
	
	public static void displayNumberPlus1000(int a, int b) {
		int c = a + 1000;
		int d = b + 1000;
		System.out.println(a + " + 1000 = " + c);
		System.out.println(b + " + 1000 = " + d);
	}
}
