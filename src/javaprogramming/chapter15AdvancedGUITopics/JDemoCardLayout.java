package javaprogramming.chapter15AdvancedGUITopics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

@SuppressWarnings("serial")
public class JDemoCardLayout extends JFrame implements ActionListener {
	
	private CardLayout cards = new CardLayout(5, 10); //5 for left and right gap and 10 for top and bottom.
	private JButton b1 = new JButton("Ace of Hearts");
	private JButton b2 = new JButton("Three of Spades");
	private JButton b3 = new JButton("Queen of Clubs");
	private Container con = getContentPane();
	
	public JDemoCardLayout() {
		con.setLayout(cards);
		con.add("ace", b1); //aString (representing a name), //aContainer (the button)
		b1.addActionListener(this);
		con.add("three", b2);
		b2.addActionListener(this);
		con.add("queen", b3);
		b3.addActionListener(this);
		setSize(200, 100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JDemoCardLayout();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		cards.next(getContentPane()); //flips to the next card.
		//cards.previous(getContentPane());
		//cards.fist(getContentPane());
		//cards.last(getContentPane());
		
	}

}
