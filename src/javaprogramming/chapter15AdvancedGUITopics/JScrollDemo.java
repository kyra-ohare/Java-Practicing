package javaprogramming.chapter15AdvancedGUITopics;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class JScrollDemo extends JFrame {
	private JPanel panel = new JPanel();
	private JScrollPane scroll = new JScrollPane(panel, ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS, ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
	private JLabel label = new JLabel("Four score and seven");
	private Font bigFont = new Font("Arial", Font.PLAIN, 20);
	private Container con;
	
	public JScrollDemo() {
		super("JScrollDemo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		con = getContentPane();
		label.setFont(bigFont);
		con.add(scroll); //add scroll to the frame
		panel.add(label); //because the label is added on the scroll already
	}
	
	public static void main(String[] args) {
		final int WIDTH = 180;
		final int HEIGHT = 100;
		JScrollDemo aFrame = new JScrollDemo();
		aFrame.setSize(WIDTH, HEIGHT);
		aFrame.setVisible(true);
	}

}
