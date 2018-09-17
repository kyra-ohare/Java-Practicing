/*
 * Exercise 5, page 437
 */
package javaprogramming.chapter08Arrays;

import java.util.Scanner;

public class DivideStrings {

	public static void main(String[] args) {
		String[] shortStrings = {"Hi", "car", "tree", "kiss", "pad", "tv"};
		String[] longStrings = {"street", "country", "coffee", "pillow", "computer", "window"};
		int user;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Which kind of strings would you like? 1 or 2 >> ");
		user = input.nextInt();
		
		if(user == 1) {
			for(int i = 0; i < shortStrings.length; i ++) {
				System.out.print(shortStrings[i] + " ");
			}
		} else 
			if (user == 2){
			for(int i = 0; i < longStrings.length; i ++) {
				System.out.print(longStrings[i] + " ");
			}
		} else
			System.out.println("Invalid input");
		
		input.close();
	}

}
