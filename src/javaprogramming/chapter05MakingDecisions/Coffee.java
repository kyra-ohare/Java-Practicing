/*
 * Exercise 5, page 292.
 */
package javaprogramming.chapter05MakingDecisions;

import javax.swing.JOptionPane;

public class Coffee {

	public static void main(String[] args) {
		byte option;
		String coffee = null;
		double price = 0;
		double total = 0;
		
		do {
			option = Byte.parseByte(JOptionPane.showInputDialog(null, "Welcome to Jivin' Java Coffee\nSelect:\n1 for Americano £1.99\n2 for Espresso £2.50\n3 for Latte £2.15\n 0 to exit"));
			switch(option) {
			case 0:
				coffee = "to exit.";
				break;
			case 1:
				coffee = "Americano";
				price = 1.99;
				break;
			case 2:
				coffee = "Espresso";
				price = 2.50;
				break;
			case 3:
				coffee = "Latte";
				price = 2.15;
				break;
			default:
				coffee = "N/A";
				price = 0;
			}

			if(option != 0)
				total += price;

			if(option != 0)
				JOptionPane.showMessageDialog(null, "You selected " + coffee + " £ " + price);
			else
				JOptionPane.showMessageDialog(null, "Total £ " + total + ".\nPlease, proceed to check-out");
			
		} while(option != 0);
	}
}
