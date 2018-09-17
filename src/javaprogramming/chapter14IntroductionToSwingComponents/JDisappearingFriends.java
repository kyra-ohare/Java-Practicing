/*
 * Exercise 3, page 797.
 */
package javaprogramming.chapter14IntroductionToSwingComponents;

import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class JDisappearingFriends extends JFrame implements ActionListener {
	final int WIDTH = 100;
	final int HEIGHT = 100;
	int counter = 0;
	
	FlowLayout flow = new FlowLayout();
	JLabel label = new JLabel("Alice");
	JButton button = new JButton("Click here!");
	
	public JDisappearingFriends() {
		super("Disappearing Friends");
		setLayout(flow);
		
		add(label);
		add(button);
		button.addActionListener(this);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(WIDTH, HEIGHT);
		setVisible(true);
	}	

	public void actionPerformed(ActionEvent e) {
		++counter;
		switch(counter) {
		case 1:
			label.setText("Bob");
			break;
		case 2:
			label.setText("Charlie");
			break;
		case 3:
			label.setText("David");
			break;
		case 4:
			label.setText("Edward");
			break;
		default:
			label.setText("Alice");
			counter = 0;
		}
	}
		
	public static void main(String[] args) {
		new JDisappearingFriends();
	}

}
