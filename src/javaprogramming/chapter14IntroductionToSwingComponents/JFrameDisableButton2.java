/*
 * Exercise 2, page 796.
 */
package javaprogramming.chapter14IntroductionToSwingComponents;

import java.awt.event.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class JFrameDisableButton2 extends JFrame implements ActionListener {
	final int WIDTH = 200;
	final int HEIGHT = 200;
	final int LIMIT = 3;
	int counter = 0;
	JLabel enough = new JLabel("That's enough!");
	JButton button = new JButton("PrEsS mE");
	
	public JFrameDisableButton2() {
		super("Enabled-Disabled");
		setSize(WIDTH, HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		button.addActionListener(this);
		add(button);
	}
	public void actionPerformed(ActionEvent e) {
		counter++;
		
		if(counter == LIMIT)
			button.setEnabled(false);
	}
	public static void main(String[] args) {
		new JFrameDisableButton2();
	}
}
