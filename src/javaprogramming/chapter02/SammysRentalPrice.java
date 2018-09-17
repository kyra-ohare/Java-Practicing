package javaprogramming.chapter02;

import javax.swing.JOptionPane;

public class SammysRentalPrice{
	public static void main(String[] args){
		String equipment;
		String timeString;
		String addFeeString;
		int rental = 40;
		int timeInt;
		int addFeeInt = 1;
		int total;
		
		JOptionPane.showMessageDialog(null, "Welcome to Sammys Rental", "Sammys Rental", JOptionPane.PLAIN_MESSAGE);
		
		equipment = JOptionPane.showInputDialog(null, "Which piece of equipment?", "Sammys Rental", JOptionPane.QUESTION_MESSAGE);
		
		timeString = JOptionPane.showInputDialog(null, "How long (per hour)?", "Sammys Rental", JOptionPane.QUESTION_MESSAGE);
		timeInt = Integer.parseInt(timeString);
		
		addFeeString = JOptionPane.showInputDialog(null, "Additional Time Fee in Minutes", "Sammys Rental", JOptionPane.QUESTION_MESSAGE);
		addFeeInt = Integer.parseInt(addFeeString);
		
		total = (timeInt * rental) + addFeeInt;
		
		JOptionPane.showMessageDialog(null, "Equiment: " + equipment + "\nTime: " + timeInt + "\nRental: " + rental + "\nFee (extra minutes): " + addFeeInt + "\nTOTAL: " + total + " euro", "SUMMARY - Sammys Rental", JOptionPane.WARNING_MESSAGE);	
	}
}