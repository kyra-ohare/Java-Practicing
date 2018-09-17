/*
 * Exercise 3, page 388.
 */
package javaprogramming.chapter07;

import javax.swing.JOptionPane;

public class FiveLettersAndFiveDigits {

	public static void main(String[] args) {
		String password;
		char[] array;
		int letters = 0;
		int digits = 0;
		int LIMIT = 5;

		do {
			password = JOptionPane.showInputDialog(null, "Key password in");
			array = password.toCharArray();

			for(int i = 0; i < array.length; i++) {
				if(array[i] == '0' || array[i] == '1' || array[i] == '2' || array[i] == '3' || array[i] == '4' || array[i] == '5' || array[i] == '6' || array[i] == '7' || array[i] == '8' || array[i] == '9')
					digits ++;
				else
					letters ++;
			}

			if(letters < LIMIT || digits < LIMIT) {
				JOptionPane.showMessageDialog(null,  "Bad password\nA password sould contain at least " + LIMIT + " letters and " + LIMIT + " digits\nYou endered " + letters + " letters and " + digits + " digits.\nTry again!");
				letters = 0;
				digits = 0;
			} else
				JOptionPane.showMessageDialog(null, "Good password.\nLetters: " + letters + " and digits: " + digits);

		} while(letters <= LIMIT || letters <= LIMIT);
	}
}