/*
 * Exercise 2, page 388.
 */
package javaprogramming.chapter07;

import java.util.Scanner;

public class CountSpaces {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		String message = new String("The person who says something is impossible should not interrupt the person who is doing it.");
		text(message);
		
		System.out.print("\nKey in your message >>> ");
		message = input.nextLine();
		text(message);
		
		if(input != null)
			input.close();
	}
	
	public static void text(String message) {
		int counter = 0;
		for(int i = 0; i < message.length(); i++) {
			if(message.charAt(i) == ' ')
				counter++;
		}
		
		System.out.println(message);
		System.out.println("Length: " + message.length() + "\nHow many spaces? " + counter);
		
		counter = 1;
		for(String splits : message.split(" ")) {
			System.out.println(counter + " " + splits);
			counter++;
		}
	}
}
