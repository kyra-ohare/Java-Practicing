package javaprogramming.chapter09Arrays;

import java.util.*;
import javax.swing.*;

public class VerifyCode {

	public static void main(String[] args) {
		char[] codes = {'B', 'E', 'K', 'M', 'P', 'S', 'T'};
		String entry;
		String upperCase;
		char usersCode;
		int position;
		
		entry = JOptionPane.showInputDialog(null, "Enter a product code");
		
		String str = new String(entry);
		upperCase = str.toUpperCase();
		
		usersCode = upperCase.charAt(0);
		position = Arrays.binarySearch(codes, usersCode);
		
		if(position >= 0)
			JOptionPane.showMessageDialog(null,  "Position of " + usersCode + " is " + position);
		else
			JOptionPane.showMessageDialog(null, usersCode + " is an invalid code.");
	}

}
