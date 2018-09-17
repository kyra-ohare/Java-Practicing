/*
 * Exercise 5, page 113.
 */
package javaprogramming.chapter02;

import javax.swing.JOptionPane;

public class ProjectedSales {

	public static void main(String[] args) {
		double anticipatedIncrease;
		double northSales;
		double southSales;
		double percentage = 100;
		
		anticipatedIncrease = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the anticipated increase for next year"));
		northSales = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the North Sales"));
		southSales = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter the South Sales"));
		
		anticipatedIncrease /= percentage;
		northSales *= anticipatedIncrease;
		southSales *= anticipatedIncrease;
		
		JOptionPane.showMessageDialog(null, "The projected sales for next year for each division are:\nNorth Sales : " + northSales + "\nSouth Sales: " + southSales);
	}

}
