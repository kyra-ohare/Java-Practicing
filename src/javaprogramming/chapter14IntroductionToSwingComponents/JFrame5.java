package javaprogramming.chapter14IntroductionToSwingComponents;

import javax.swing.*;
import java.awt.*;

public class JFrame5 {
	public static void main(String[] args) {
		final int FRAME_WIDTH = 250;
		final int FRAME_HEIGHT = 200;
		
		JFrame aFrame = new JFrame("Fifth frame");
		aFrame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
		aFrame.setVisible(true);
		aFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel greeting = new JLabel("Hello");
		JLabel greeting2 = new JLabel("Who are you?");
		aFrame.setLayout(new FlowLayout(FlowLayout.LEFT)); // use when you need to add components form left to right.
		aFrame.add(greeting);
		aFrame.add(greeting2);
		aFrame.repaint();
	}
}
