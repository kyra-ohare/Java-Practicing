/*
 * Exercise 8, page 173.
 */
package javaprogramming.chapter03;

import javax.swing.JOptionPane;

public class Insurance {
	public static void main(String[] args){
		String currentYearS, birthYearS;
		int currentYear, birthYear;
		
		currentYearS = JOptionPane.showInputDialog(null, "What is the current year?");
		currentYear = Integer.parseInt(currentYearS);
		birthYearS = JOptionPane.showInputDialog(null, "What is the birth year?");
		birthYear = Integer.parseInt(birthYearS);
		JOptionPane.showMessageDialog(null, "The insurance calculation for " + currentYear + " calendar is: " + calculation(currentYear, birthYear));
	}
	
	public static double calculation(int cy, int by){
		int difference = cy - by;
		difference *= 0.10;
		difference += 15;
		difference *= 20;
		return difference;
	}
}
