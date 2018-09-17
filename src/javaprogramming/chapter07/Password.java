/*
 * Exercise 12, page 390.
 */
package javaprogramming.chapter07;

import java.util.Scanner;

public class Password {
	public static void main(String[] args) {
		boolean comparison;
		
		String first = getPassword();
		String second = getAnotherPassword();
		
		comparison = first.equals(second);
		
		if(comparison)
			System.out.println("You have created a password succesfully.");
		else
			System.out.println("Passwords do not match.");
	}
	
	public static String getPassword() {
		String password;
		char[] characters;
		int MIN_CHAR = 6;
		int MAX_CHAR = 10;
		int LIMIT_CHAR = 1;
		int length;
		int letterCounter = 0;
		int digitCounter = 0;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Create a password >>> ");
		password = input.nextLine();
		length = password.length();
		characters = password.toCharArray();
		
		for(int i = 0; i < characters.length; i ++) {
			if(Character.isLetter(characters[i])) {
				letterCounter ++;
			}else if(Character.isDigit(characters[i]))
				digitCounter ++;
		}
		
		while(length < MIN_CHAR || length > MAX_CHAR || letterCounter < LIMIT_CHAR || digitCounter < LIMIT_CHAR) {
			System.out.println("Your password must contain at least " + MIN_CHAR + " characters and at most " + MAX_CHAR + " characters plus digits.\nTry again >>> ");
			password = input.nextLine();
			length = password.length();
			characters = password.toCharArray();
			
			for(int i = 0; i < characters.length; i ++) {
				if(Character.isLetter(characters[i])) {
					letterCounter ++;
				}else if(Character.isDigit(characters[i]))
					digitCounter ++;
			}
			
			if(letterCounter < LIMIT_CHAR || digitCounter < LIMIT_CHAR) {
				digitCounter = 0;
				letterCounter = 0;
			}
		}
		if(input != null)
			input.close();
		
		return password;
	}
	
	public static String getAnotherPassword() {
		String password;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Reenter the password >>> ");
		password = input.nextLine();
		
		if(input != null)
			input.close();
		
		return password;
	}
}
