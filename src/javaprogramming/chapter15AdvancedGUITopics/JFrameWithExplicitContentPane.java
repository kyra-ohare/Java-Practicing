package javaprogramming.chapter15AdvancedGUITopics;

import java.awt.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class JFrameWithExplicitContentPane extends JFrame {
	private final int SIZE = 180;
	private Container con = getContentPane();
	private JButton button = new JButton("Press Me");
	
	public JFrameWithExplicitContentPane() {
		super("Frame");
		setSize(SIZE, SIZE);
		con.setLayout(new FlowLayout());
		con.add(button);
	}
	
	public static void main(String[] args) {
		JFrameWithExplicitContentPane frame = new JFrameWithExplicitContentPane();
		frame.setVisible(true);
	}

}
