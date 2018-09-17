/*
 * Exercise 9, page 390.
 */
package javaprogramming.chapter07;

import javax.swing.*;

public class SumIntegersInString {

	public static void main(String[] args) {
		String message;
		String[] numbers;
		int number;
		int total = 0;
		
		
		message = JOptionPane.showInputDialog(null, "Enter some integers");
		numbers = message.split(" ");
		
		for(int i = 0; i < numbers.length; i++) {
				number = Integer.parseInt(numbers[i]);
				total += number ;
		}
		
		JOptionPane.showMessageDialog(null, "Total sum of the integers " + total);
	}

}
