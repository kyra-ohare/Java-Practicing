/*
 * Exercise 3a, page 436;
 */
package javaprogramming.chapter08Arrays;

import javax.swing.JOptionPane;

public class CarpentryChoice {

	public static void main(String[] args) {
		int MAX_OPTIONS = 5;
		int[] options = {0, 1, 2, 3, 4, 5};
		int option = 0;
		String[] pieces = {"", "table", "desk", "dresser", "entertainment center"};
		String piece = null;
		double[] prices = {0, 250, 325, 420, 600};
		double price = 0;
		int user;
		boolean validOption = false;
		char c;
		
		user = Integer.parseInt(JOptionPane.showInputDialog(null, "Here are our specials.\n1 - Table: $ 250\n2 - Desk: 325\n3 - Dresser: 420\n4 - Entertainment center: 600\n", "Please, choose your choice here."));
		
		for(int i = 0; i < MAX_OPTIONS; i++) {
			if(user == options[i]) {
				validOption = true;
				option = options[i];
				piece = pieces[i];
				int stringLength = piece.length();
				for(int j = 0; j < stringLength; ++j) {
					c = piece.charAt(j);
					if(j == 0) {
						c = Character.toUpperCase(c);
						piece = c + piece.substring(1, stringLength);
					}
				}
				price = prices[i];
			}
		}
		if(validOption)
			JOptionPane.showMessageDialog(null, "Your choice is\n" + option + ": " + piece + " for £" + price + ".");
		else
			JOptionPane.showMessageDialog(null, "Sorry - invalid item entered.");
	}

}
