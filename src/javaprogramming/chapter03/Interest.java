/*
 * Exercise 10, page 173.
 */
package javaprogramming.chapter03;

import javax.swing.JOptionPane;

public class Interest{
	public static void main(String[] args){
		String initialValueS, yearS, currentYearS;
		double initialValue;
		int currentYear, year;
		
		currentYearS = JOptionPane.showInputDialog(null, "What is the current year?");
		currentYear = Integer.parseInt(currentYearS);
		initialValueS = JOptionPane.showInputDialog(null, "What is the initial value?");
		initialValue = Double.parseDouble(initialValueS);
		yearS = JOptionPane.showInputDialog(null, "In how many years?");
		year = Integer.parseInt(yearS);
		JOptionPane.showMessageDialog(null, "Present year: " + currentYear + " Prediction of " + interest(initialValue, year) + " with a starting value of " + initialValueS + " in " + year + " years.");
	}
	
	public static double interest(double value, int year){
		double total;
		final double RATE = 0.05;
		total = (value * RATE) * year;
		return total;
	}
}