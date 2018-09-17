package javaprogramming.chapter07;

import javax.swing.*;

public class BusinessLetter {

	public static void main(String[] args) {
		String name;
		String firstName, fName = "";
		String familyName, fFamily = "";
		char firstChar, familyChar;
		int counter;
		name = JOptionPane.showInputDialog(null, "Please enter customer's first and last name");
		
		
		counter = 0;
		while(counter < name.length()) {
			if(name.charAt(counter) == ' ') { // Splitting Strings
				firstName = name.substring(0, counter); //First String
				firstChar = firstName.charAt(0); //Locating the first character
				fName = Character.toUpperCase(firstChar) + firstName.substring(1); //Transforming the first character to Upper Case and concatenate with the rest
				
				familyName = name.substring(counter + 1, name.length()); //Second String
				familyChar = familyName.charAt(0); //Locating the first character
				fFamily = Character.toUpperCase(familyChar) + familyName.substring(1);  //Transforming the first character to Upper Case and concatenate with the rest
				
				counter = name.length();
			}
			++counter;
		}
		
		if(fFamily != "")
			JOptionPane.showMessageDialog(null,  "Dear " + fName + ",\nI am so glad we are on a first name basis\nbecause I would like the opportunity to\ntalk to you about an affordable insurance\nproctection plan for the entire "  + fFamily + "\nfamily. Call A-One Family Insurance today\nat 1-800-555-9287.");
		else
			JOptionPane.showMessageDialog(null,  "You did not enter the last name.", "Try Again!!!!", JOptionPane.ERROR_MESSAGE);
	}

}
