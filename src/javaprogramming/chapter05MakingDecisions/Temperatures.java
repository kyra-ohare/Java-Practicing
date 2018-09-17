/*
 * Exercise 2, page 291.
 */
package javaprogramming.chapter05MakingDecisions;

import javax.swing.JOptionPane;

public class Temperatures {

	public static void main(String[] args) {
		int temp = Integer.parseInt(JOptionPane.showInputDialog(null, "What's today's temperature?", JOptionPane.QUESTION_MESSAGE));
		
		if(temp >= 20)
			JOptionPane.showMessageDialog(null, "Heat warning.", "Temperature Information", JOptionPane.WARNING_MESSAGE);
		else if(temp <= 0)
			JOptionPane.showMessageDialog(null,"Freeze warning", "Temperature Information", JOptionPane.WARNING_MESSAGE);
		else
			JOptionPane.showMessageDialog(null,"Mild temperature", "Temperature Information", JOptionPane.INFORMATION_MESSAGE);
	}

}
