/*
 * Exercise 8, page 389.
 */
package javaprogramming.chapter07;

import javax.swing.JOptionPane;

public class ThreeLetterAcronym {

	public static void main(String[] args) {
		String message;
		String upperCase;
		String[] words;
		char first;
		char second;
		char third;
		
		message = JOptionPane.showInputDialog(null, "Enter three words");
		upperCase = message.toUpperCase();
		words = upperCase.split(" ");
		first = words[0].charAt(0);
		second = words[1].charAt(0);
		third = words[2].charAt(0);
		
		JOptionPane.showMessageDialog(null, "Original phrase was " + message + "\nThree letter acronym is " + first + second + third);
	}

}
