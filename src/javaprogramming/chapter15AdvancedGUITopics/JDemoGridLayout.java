package javaprogramming.chapter15AdvancedGUITopics;

import javax.swing.*;
import java.awt.*;

@SuppressWarnings("serial")
public class JDemoGridLayout extends JFrame {
	private JButton b1 = new JButton("Button 1");
	private JButton b2 = new JButton("Button 2");
	private JButton b3 = new JButton("Button 3");
	private JButton b4 = new JButton("Button 4");
	private JButton b5 = new JButton("Button 5");
	private GridLayout layout = new GridLayout(3, 2, 5, 5); //3 rows, 2 columns, 5 pixels of gap for horizontal and vertical
	private Container con = getContentPane();

	public JDemoGridLayout() {
		con.setLayout(layout);
		con.add(b1);
		con.add(b2);
		con.add(b3);
		con.add(b4);
		con.add(b5);
		setSize(200, 200);
		setVisible(true);
	}

	public static void main(String[] args) {
		new JDemoGridLayout();
	}

}
