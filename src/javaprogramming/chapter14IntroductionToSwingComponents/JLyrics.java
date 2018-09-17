/*
 * Exercise 1, page 796.
 */
package javaprogramming.chapter14IntroductionToSwingComponents;

import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class JLyrics extends JFrame {
	final int WIDTH = 300;
	final int HEIGHT = 200;
	
	FlowLayout flow = new FlowLayout();
	Font font = new Font("Arial", Font.BOLD, 16);
	
	JLabel title = new JLabel("Our God is an awesome God!");
	JLabel blank = new JLabel("                                            ");
	JLabel firstLine = new JLabel("Our God is an awesome God");
	JLabel secondLine = new JLabel("He reigns from heaven above");
	JLabel thirdLine = new JLabel("with wisdom, power and love");
	JLabel fourthLine = new JLabel("Our God is an awesome God");

	public JLyrics() {
		super("Favourite lyrics");
		title.setFont(font);
		
		add(title);
		add(blank);
		add(firstLine);
		add(secondLine);
		add(thirdLine);
		add(fourthLine);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(flow);
		setSize(WIDTH, HEIGHT);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JLyrics();
	}
}
