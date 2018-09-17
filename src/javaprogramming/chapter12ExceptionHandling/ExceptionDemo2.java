package javaprogramming.chapter12ExceptionHandling;

import javax.swing.JOptionPane;

public class ExceptionDemo2 {
	public static void main(String[] args) {
		int numerator = 0;
		int denominator = 0;
		int result;
		String inputString;
		
		try {
			inputString = JOptionPane.showInputDialog(null, "Enter a number to be divided");
			numerator = Integer.parseInt(inputString);
			
			inputString = JOptionPane.showInputDialog(null, "Entere a number to divide into the first number");
			denominator = Integer.parseInt(inputString);
			result = numerator / denominator;
		} 
		catch (ArithmeticException exception) {
			JOptionPane.showMessageDialog(null, exception.getMessage());
			result = 0;
		}
		catch(NumberFormatException exception) {
			JOptionPane.showMessageDialog(null, "This application accepts integers only!");
			numerator = 999;
			denominator = 999;
			result = 1;
		}
		
		JOptionPane.showMessageDialog(null, numerator + " / " + denominator + "\nResult is " + result);
	}
}
