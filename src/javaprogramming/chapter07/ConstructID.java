/*
 * Exercise 11, page 390.
 */
package javaprogramming.chapter07;

import java.util.Scanner;

public class ConstructID {

	public static void main(String[] args) {
		String name;
		String originalName;
		char[] letters;

		String address;
		char[] numbers;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter your full name >>> ");
		name = input.nextLine();
		originalName = name.toUpperCase();
		letters = originalName.toCharArray();

		System.out.print("Enter your address >>> ");
		address = input.nextLine();
		numbers = address.toCharArray();

		System.out.print(letters[0]);
		for(int i = 1; i < originalName.length(); i++) {
			if(Character.isWhitespace(letters[i])) {
				System.out.print(letters[i+1]);
			}

		}
		for(int j = 0; j < address.length(); j ++) {
			if(Character.isDigit(numbers[j])) {
				System.out.print("You ID is: " + numbers[j]);
			}
		}
		if(input != null)
			input.close();
	}
}
