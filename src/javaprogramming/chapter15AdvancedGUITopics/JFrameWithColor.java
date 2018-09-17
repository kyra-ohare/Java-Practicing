package javaprogramming.chapter15AdvancedGUITopics;

import java.awt.*;
import javax.swing.*;
import java.awt.Color;

@SuppressWarnings("serial")
public class JFrameWithColor extends JFrame {
	private final int SIZE = 180;
	private Container con = getContentPane();
	private JButton button = new JButton("Press Me");
	private Font font = new Font("Arial", Font.BOLD, 20);
	
	public JFrameWithColor() {
		super("Frame");
		setSize(SIZE, SIZE);
		
		con.setLayout(new FlowLayout());
		
		button.setFont(font);
		con.add(button);
		
		con.setBackground(Color.YELLOW); //on the frame
		button.setBackground(Color.RED); //on the button
		button.setForeground(Color.WHITE); //letters of the button
	}
	
	public static void main(String[] args) {
		JFrameWithColor frame = new JFrameWithColor();
		frame.setVisible(true);
	}

}
