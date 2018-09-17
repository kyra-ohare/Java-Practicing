package javaprogramming.chapter14IntroductionToSwingComponents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class JHelloFrame extends JFrame implements ActionListener {
	
	JLabel question = new JLabel("What is your name?");
	Font bigFont = new Font("Arial", Font.BOLD, 16);
	JButton pressMe = new JButton("Press me");
	JLabel greeting = new JLabel("");
	
	JTextField answer = new JTextField(10);
	
	final int WIDTH = 275;
	final int HEIGHT = 225;
	
	public JHelloFrame() {
		super("Hello Frame"); //frame name
		setSize(WIDTH, HEIGHT);
		setLayout(new FlowLayout()); //components left to right
		question.setFont(bigFont);
		greeting.setFont(bigFont);
		add(question); //add to the JFrame
		add(answer);
		add(pressMe);
		add(greeting);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		pressMe.addActionListener(this); //responds with a click
		answer.addActionListener(this); //responds with Enter
		setVisible(true);
		//pressMe.setEnabled(false); //enables or disables a button
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		String name = answer.getText();
		String greet = "Hello, " + name + ".";
		greeting.setText(greet);
		
		Object source = e.getSource();
		System.out.println(source);
	}
	public static void main(String[] args) {
		new JHelloFrame();
	}

}
