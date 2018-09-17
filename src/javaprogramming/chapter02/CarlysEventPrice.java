/*
 * Case problem # 1, page 116.
 */
package javaprogramming.chapter02;

import javax.swing.JOptionPane;

public class CarlysEventPrice{
	public static void main(String[] args){
		String employeeName;
		String guestString;
		String pricePerGuestString;
		int guestInt;
		double pricePerGuestDouble = 35;
		double totalPrice;
		boolean isYes;
		int selection;
		
		motto2();
		
		employeeName = JOptionPane.showInputDialog(null, "Employee's name:", "CARLY'S EVENTS", JOptionPane.QUESTION_MESSAGE);
		JOptionPane.showMessageDialog(null, "Welcome " + employeeName);
		
		guestString = JOptionPane.showInputDialog(null, "Number of guests:", "CARLY'S EVENTS", JOptionPane.QUESTION_MESSAGE);
		guestInt = Integer.parseInt(guestString);
		
		pricePerGuestString = JOptionPane.showInputDialog(null, "Price per Guest:", "CARLY'S EVENTS", JOptionPane.QUESTION_MESSAGE);
		pricePerGuestDouble = Double.parseDouble(pricePerGuestString);
		
		totalPrice = pricePerGuestDouble * guestInt;
		
		JOptionPane.showMessageDialog(null, "Number of Guests are: " + guestString + "\nPrice per guest is: " + pricePerGuestString + "\nTotal price: " + totalPrice, "CARLY'S EVENTS", JOptionPane.PLAIN_MESSAGE);
		
		selection = JOptionPane.showConfirmDialog(null, "Are there more than 50 guests?", "CARLY'S EVENTS", JOptionPane.YES_NO_OPTION);
		isYes = (selection == JOptionPane.YES_OPTION);
		JOptionPane.showMessageDialog(null, "You responded " + isYes);
	}
	public static void motto2() {
		JOptionPane.showMessageDialog(null, "****************************************************\n*Carly's makes the food that makes it a party.*\n****************************************************");
	}
}