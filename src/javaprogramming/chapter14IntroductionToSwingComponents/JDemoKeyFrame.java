package javaprogramming.chapter14IntroductionToSwingComponents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class JDemoKeyFrame extends JFrame implements KeyListener {
	private JLabel prompt = new JLabel("Type keys below:");
	private JTextField textField = new JTextField(10);
	private JLabel outputLabel = new JLabel();
	
	public JDemoKeyFrame() {
		setTitle("JKey Frame");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		setLayout(new BorderLayout());
		add(prompt, BorderLayout.NORTH);
		add(textField, BorderLayout.CENTER);
		add(outputLabel, BorderLayout.SOUTH);
		addKeyListener(this);
		textField.addKeyListener(this);
	}
	
	public void keyPressed(KeyEvent e) {
		
	}

	public void keyReleased(KeyEvent e) {
		
	}

	public void keyTyped(KeyEvent e) {
		char c = e.getKeyChar();
		outputLabel.setText("Last key typed: " + c);
	}
	
	public static void main(String[] args) {
		JDemoKeyFrame keyFrame = new JDemoKeyFrame();
		final int WIDTH = 250;
		final int HEIGHT = 100;
		keyFrame.setSize(WIDTH, HEIGHT);
		keyFrame.setVisible(true);
	}
}
