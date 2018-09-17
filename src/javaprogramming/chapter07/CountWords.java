/*
. * Exercise 5, page 388.
 */
package javaprogramming.chapter07;

import java.util.Scanner;

public class CountWords {

	public static void main(String[] args) {
		String sentence;
		Scanner input = new Scanner(System.in);
		int result;
		
		System.out.print("Enter a string >> ");
		sentence = input.nextLine();
		//result = sentence.length();
		result = countWords(sentence);
		System.out.println("There are " + result + " word in this string.");
		
		
		input.close();
	}
	
	public static int countWords(String s) {
		int wordCount = 0;
		boolean character = false;
		int endOfLine = s.length() - 1;
		
		for(int i = 0; i < s.length(); i ++) {
			System.out.println("Iteration: " + i);
			//if the char is a letter, character = true.
			if(Character.isLetter(s.charAt(i)) && i != endOfLine) {
				System.out.println("IF (Character.isLetter(s.charAt(i)) && i != endOfLine): " + (Character.isLetter(s.charAt(i)) && i != endOfLine) + "\n");
				character = true;
				
				
				//if char isn't a letter and there have been letters before, counter goes up.
			} else if( !Character.isLetter(s.charAt(i)) && character) {
				System.out.println("character: " + character);
				System.out.println("1 ELSE IF ( !Character.isLetter(s.charAt(i)) && character): " + ( ! Character.isLetter(s.charAt(i)) && character));
				wordCount ++;
				System.out.println("1 wordCount: " + wordCount + "\n");
				character = false;
				
				
				//last word of String; if it doesn't end with a non letter, it wouldn't count without this.
			} else if(Character.isLetter(s.charAt(i)) && i == endOfLine) {
				System.out.println("2 ELSE IF(Character.isLetter(s.charAt(i)) && i == endOfLine): " + (Character.isLetter(s.charAt(i)) && i == endOfLine));
				wordCount ++;
				System.out.println("2 wordCount: " + wordCount + "\n");
			}
		}
		
		return wordCount;
	}

}
