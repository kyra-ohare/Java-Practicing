package javaprogramming.chapter06Looping;

import javax.swing.JOptionPane;

public class RetirementGoal {
	public static void main(String[] args) {
		int years;
		double amount;
		double result;
		double resultWithInterest;
		double withInterest;
		double interest = 0.05;
		
		years = Integer.parseInt(JOptionPane.showInputDialog(null, "In how many years will you retire?"));
		while(years <= 0) {
			JOptionPane.showMessageDialog(null, "You entered invalid data.", "WARNING", JOptionPane.ERROR_MESSAGE);
			years = Integer.parseInt(JOptionPane.showInputDialog(null, "In how many years will you retire?"));
		}
		
		amount = Integer.parseInt(JOptionPane.showInputDialog(null, "How much can you save annually?"));
		while(amount < 0) {
			JOptionPane.showMessageDialog(null, "You entered invalid data.", "WARNING", JOptionPane.ERROR_MESSAGE);
			amount = Integer.parseInt(JOptionPane.showInputDialog(null, "How much can you save annually?"));
		}
		
		result = years * amount;
		withInterest = result * interest;
		resultWithInterest = result + withInterest;
		JOptionPane.showMessageDialog(null, "You will have €" + result + " (no interest added) to enjoy your retirement.\nOr with 5% interest added\nYou will have €" + resultWithInterest + "  to enjoy your retirement.");
		
	}
}
