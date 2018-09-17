/*
 * Exercise 2, page 796.
 */

package javaprogramming.chapter14IntroductionToSwingComponents;

import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public class JFrameDisableButton extends JFrame implements ActionListener {
	final int WIDTH = 200;
	final int HEIGHT = 200;
	JButton button = new JButton("Random Button");
	
	public JFrameDisableButton() {
		setSize(WIDTH, HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		button.addActionListener(this);
		add(button);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		
		if(source == button)
			button.setEnabled(false);
	}
	
	public static void main(String[] args) {
		new JFrameDisableButton();
	}
}
