package javaprogramming.chapter07;

import javax.swing.JOptionPane;

public class NumberInput {

	public static void main(String[] args) {
		String inputString;
		int inputNumber;
		int result;
		final int FACTOR = 10;
		
		inputString = JOptionPane.showInputDialog(null, "Enter a nubmer");
		inputNumber = Integer.parseInt(inputString);
		result = inputNumber * FACTOR;
		JOptionPane.showMessageDialog(null, inputNumber + " * " + FACTOR + " = " + result);
		
	}

}
