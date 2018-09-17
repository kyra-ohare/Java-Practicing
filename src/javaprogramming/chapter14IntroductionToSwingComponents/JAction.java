package javaprogramming.chapter14IntroductionToSwingComponents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class JAction extends JFrame implements ActionListener {
	JLabel label = new JLabel("Enter your name");
	JLabel answer = new JLabel("");
	JTextField field = new JTextField(12);
	JButton button = new JButton("OK");
	
	public JAction() {
		super("Action");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout()); //when no args are taken into FlowLayout(), CENTER is its default
		add(label);
		add(field);
		add(button);
		add(answer);
		button.addActionListener(this);
		field.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		label.setText("Thank you");
		button.setText("Done");
		
		//different results
		Object source = e.getSource();
		if(source == field)
			label.setText("You pressed Enter");
		else
			label.setText("You clicked the button");
	}
	
	public static void main(String[] args) {
		JAction aFrame = new JAction();
		final int WIDTH = 250;
		final int HEIGHT = 100;
		aFrame.setSize(WIDTH, HEIGHT);
		aFrame.setVisible(true);
	}
}
