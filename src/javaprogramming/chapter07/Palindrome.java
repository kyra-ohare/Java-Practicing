/*
 * Exercise 10, page 390.
 */
package javaprogramming.chapter07;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		String message;
		int length;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a sentence to determine whether it is a palindrome.\nA palindrome is a phrase that reads the same backward and forward without regarding capitalization or punctuation.\n>>> ");
		message = input.nextLine();
		message.toCharArray();
		length = message.length();
		
		for(int i = length - 1; i >= 0; i--) {
				System.out.print(message.charAt(i));
		}
		
		System.out.println("\n\nSentence length: " + length);
		
		input.close();
	}

}
