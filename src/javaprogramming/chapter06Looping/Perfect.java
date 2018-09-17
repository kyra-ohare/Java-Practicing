/*
 * Exercise 7, page 343.
 */
package javaprogramming.chapter06Looping;

import java.util.Scanner;

public class Perfect {
	static double primeNumber;
	static int user;
	static Scanner input = new Scanner(System.in);
	
	public static void main(String[] args) {
		System.out.println("Enter a prime number:");
		user = input.nextInt();
		double result = perfectNumber(user);
		
		System.out.println(result + " is a perfect number out of the prime number " + user);
		input.close();
	}
	
	public static double perfectNumber(int prime) {
		double result;
		double prime2 = prime;
		prime -= 1;
		double firstElement = Math.pow(2, prime);
		double secondElement = Math.pow(2, prime2);
		
		result = firstElement * (secondElement - 1);
		
		return result;
	}

}
