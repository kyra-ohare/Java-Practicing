package javaprogramming.chapter15AdvancedGUITopics;

//This is the default layout manager

import javax.swing.*;
import static java.awt.BorderLayout.*;

@SuppressWarnings("serial")
public class JDemoBorderLayout extends JFrame {
	
	private JButton nb = new JButton("North Button");
	private JButton sb = new JButton("South Button");
	private JButton eb = new JButton("East Button");
	private JButton wb = new JButton("West Button");
	private JButton cb = new JButton("Center Button");
	//private Container con = getContentPane();
	
	public JDemoBorderLayout( ) {
		//con.setLayout(new BorderLayout());
		add(nb, NORTH); //can also use strings like "North"
		add(sb, SOUTH); //you can only refer to SOUTH because the import is static
		add(eb, EAST); //otherwise it should be BorderLayout.SOUTH
		add(wb, WEST);
		add(cb, CENTER);
		setSize(400, 150);
	}
	public static void main(String[] args) {
		JDemoBorderLayout frame = new JDemoBorderLayout();
		frame.setVisible(true);
	}

}
