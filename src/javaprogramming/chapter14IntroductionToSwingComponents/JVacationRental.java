/*
 * Exercise 4, page 797.
 */
package javaprogramming.chapter14IntroductionToSwingComponents;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Container;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.ButtonGroup;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class JVacationRental extends JFrame implements ItemListener {
	final int WIDTH = 500;
	final int HEIGHT = 300;
	final int PARKSIDE = 600;
	final int POOLSIDE = 750;
	final int LAKESIDE = 825;
	final int BEDROOM = 75;
	final int twoBedroom = 150;
	final int threeBedroom = 225;
	int typeValue = 0;
	int bedroomValue = 0;
	int total = 0;
	
	GridLayout grid = new GridLayout(4, 1);
	BorderLayout border = new BorderLayout();
	Container con = new Container();
	
	JLabel label = new JLabel("   ");
	JLabel label1 = new JLabel("Lambert's Vacation Rentals");
	JLabel label7 = new JLabel("Total:");
	
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JPanel panel4 = new JPanel();
	
	JLabel label2 = new JLabel("Type of location:");
	ButtonGroup group1 = new ButtonGroup();
	JCheckBox box1 = new JCheckBox("Parkside: $" + PARKSIDE);
	JCheckBox box2 = new JCheckBox("Poolside: $" + POOLSIDE);
	JCheckBox box3 = new JCheckBox("Lakeside: $" + LAKESIDE);
	
	JLabel label3 = new JLabel("Number of bedrooms:");
	ButtonGroup group2 = new ButtonGroup();
	JRadioButton radio1 = new JRadioButton("One bedroom: $" + BEDROOM);
	JRadioButton radio2 = new JRadioButton("Two bedrooms: $" + (2 * BEDROOM));
	JRadioButton radio3 = new JRadioButton("Three bedrooms: $" + (3 * BEDROOM));
	
	JLabel label4 = new JLabel("Summary");
	
	JLabel label5 = new JLabel("Location:");
	JTextField totalType = new JTextField(5);
	
	JLabel label6 = new JLabel("Number of Bedrooms:");
	JTextField totalBedroom = new JTextField(5);
	
	JTextField totalField = new JTextField(5);
	
	public JVacationRental() {
		super("Lambert's Resort");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(WIDTH, HEIGHT);
		setVisible(true);

		Container con = getContentPane();
		con.setLayout(grid);
		
		con.add(panel1);
			panel1.add(label1);
		con.add(panel2);
			panel2.add(label2, BorderLayout.NORTH);
			panel2.add(box1, BorderLayout.WEST);
				box1.addItemListener(this);
				group1.add(box1);
			panel2.add(box2, BorderLayout.CENTER);
				box2.addItemListener(this);
				group1.add(box2);
			panel2.add(box3, BorderLayout.EAST);
				box3.addItemListener(this);
				group1.add(box3);
		con.add(panel3);
			panel3.add(label3, BorderLayout.NORTH);
			panel3.add(radio1, BorderLayout.WEST);
				radio1.addItemListener(this);
				group2.add(radio1);
			panel3.add(radio2, BorderLayout.CENTER);
				radio2.addItemListener(this);
				group2.add(radio2);
			panel3.add(radio3, BorderLayout.EAST);
				radio3.addItemListener(this);
				group2.add(radio3);
		con.add(panel4);
			panel4.add(label4);
			panel4.add(label5);
				panel4.add(totalType);
			panel4.add(label6);
				panel4.add(totalBedroom);
			panel4.add(label7);
				panel4.add(totalField);
				
		validate();
		repaint();
	}
	public void itemStateChanged(ItemEvent e) {
		Object source = e.getSource();
		int select = e.getStateChange();
		
		if(source == box1) {
			if(select == ItemEvent.SELECTED)
				typeValue += PARKSIDE;
			else
				typeValue -= PARKSIDE;
		}
		else if(source == box2) {
			if(select == ItemEvent.SELECTED)
				typeValue += POOLSIDE;
			else
				typeValue -= POOLSIDE;
		}
		else if(source == box3) {
			if(select == ItemEvent.SELECTED)
				typeValue += LAKESIDE;
			else
				typeValue -= LAKESIDE;
		}
		totalType.setText("$" + typeValue);
		
		if(source == radio1) {
			if(select == ItemEvent.SELECTED)
				bedroomValue += BEDROOM;
			else
				bedroomValue -= BEDROOM;
		}
		else if(source == radio2) {
			if(select == ItemEvent.SELECTED)
				bedroomValue += (2 * BEDROOM);
			else
				bedroomValue -= (2 * BEDROOM);
		}
		else if(source == radio3) {
			if(select == ItemEvent.SELECTED)
				bedroomValue += (3 * BEDROOM) ;
			else
				bedroomValue -= (3 * BEDROOM);
		}
		totalBedroom.setText("$" + bedroomValue);
		
		total = typeValue + bedroomValue;
		totalField.setText("$" + total);
	}
	public static void main(String[] args) {
		new JVacationRental();
	}
}
