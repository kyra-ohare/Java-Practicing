package javaprogramming.chapter14IntroductionToSwingComponents;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;

@SuppressWarnings("serial")
public class JPizza extends JFrame implements ItemListener {
	private final int WIDTH = 500;
	private final int HEIGHT = 500;
	private final double smallSizePrice = 7;
	private final double mediumSizePrice = 9;
	private final double largeSizePrice = 11;
	private final double extraLargeSizePrice = 14;
	private double topping = 1;
	double sizeValue = 0;
	double toppingValue = 0;
	private double total = 0;
	
	GridLayout outerGrid = new GridLayout(4, 1);
	GridLayout grid3x2 = new GridLayout(3, 3);
	GridLayout grid1x3 = new GridLayout(1, 3);
	
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	JPanel panel4 = new JPanel();
	
	JLabel emptyLabel = new JLabel("");
	JLabel emptyLabel2 = new JLabel("");
	JLabel greeting = new JLabel("Welcome =)");
	JLabel pizzaSize = new JLabel("Choose your pizza size");
	JLabel pizzaPrice = new JLabel("Price:");
	JLabel toppingLabel = new JLabel("How about topptings?");
	JLabel additional = new JLabel("Additional € 1 each.");
	JLabel totalLabel = new JLabel("Total $");
	JTextField field = new JTextField(10);
	ButtonGroup buttonGroup = new ButtonGroup();

	JCheckBox sizeSmall = new JCheckBox("Small - € " + smallSizePrice);
	JCheckBox sizeMedium = new JCheckBox("Medium - € " + mediumSizePrice);
	JCheckBox sizeLarge = new JCheckBox("Large - € " + largeSizePrice);
	JCheckBox sizeExtraLarge = new JCheckBox("Extra Large - € " + extraLargeSizePrice);
	
	JCheckBox cheese = new JCheckBox("Cheese - no additional");
	JCheckBox chorizo = new JCheckBox("Chorizo");
	JCheckBox onion = new JCheckBox("Onion");
	JCheckBox tomato = new JCheckBox("Tomate");
	JCheckBox egg = new JCheckBox("Egg");
	JCheckBox parmasan = new JCheckBox("Parmasan");
	
	public JPizza() {
		super("Soares' Pizzeria");
		setSize(WIDTH, HEIGHT);
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container con = getContentPane();
		
		con.setLayout(outerGrid);
			con.add(panel1);
				panel1.setLayout(new BorderLayout());
				panel1.add(greeting, BorderLayout.CENTER);
			con.add(panel2);
				panel2.setLayout(grid3x2);
				panel2.add(pizzaSize);
				panel2.add(emptyLabel);
				panel2.add(sizeSmall);
					sizeSmall.addItemListener(this);
				panel2.add(sizeMedium);
					sizeMedium.addItemListener(this);
				panel2.add(sizeLarge);
					sizeLarge.addItemListener(this);
				panel2.add(sizeExtraLarge);
					sizeExtraLarge.addItemListener(this);
				buttonGroup.add(sizeSmall);
				buttonGroup.add(sizeMedium);
				buttonGroup.add(sizeLarge);
				buttonGroup.add(sizeExtraLarge);
			con.add(panel3);
				panel3.setLayout(grid3x2);
				panel3.add(toppingLabel);
				panel3.add(additional);
				panel3.add(emptyLabel2);
				panel3.add(cheese);
				panel3.add(chorizo);
					chorizo.addItemListener(this);
				panel3.add(onion);
					onion.addItemListener(this);
				panel3.add(tomato);
					tomato.addItemListener(this);
				panel3.add(egg);
					egg.addItemListener(this);
				panel3.add(parmasan);
					parmasan.addItemListener(this);
			con.add(panel4);
				panel4.add(totalLabel);
				panel4.add(field);
		validate();
		repaint();
	}
	
	public void itemStateChanged(ItemEvent e) {
		Object source = e.getSource();
		int select = e.getStateChange();
		
		if(source == sizeSmall) {
			if(select == ItemEvent.SELECTED)
				sizeValue += smallSizePrice;
			else
				sizeValue -= smallSizePrice;
		}
		else 
			if(source == sizeMedium) {
				if(select == ItemEvent.SELECTED)
					sizeValue += mediumSizePrice;
				else
					sizeValue -= mediumSizePrice;
			}
			else
				if(source == sizeLarge) {
					if(select == ItemEvent.SELECTED)
						sizeValue += largeSizePrice;
					else
						sizeValue -= largeSizePrice;
				}
				else
					if(source == sizeExtraLarge) {
						if(select == ItemEvent.SELECTED)
							sizeValue += extraLargeSizePrice;
						else
							sizeValue -= extraLargeSizePrice;
					}

		if(source == chorizo) {
			if(select == ItemEvent.SELECTED)
				toppingValue += topping;
			else
				toppingValue -= topping;
		}
		if(source == onion) {
			if(select == ItemEvent.SELECTED)
				toppingValue += topping;
			else
				toppingValue -= topping;
		}
		if(source == tomato) {
			if(select == ItemEvent.SELECTED)
				toppingValue += topping;
			else
				toppingValue -= topping;				
		}
		if(source == egg) {
			if(select == ItemEvent.SELECTED)
				toppingValue += topping;
			else
				toppingValue -= topping;						
		}
		if(source == parmasan) {
			if(select == ItemEvent.SELECTED)
				toppingValue += topping;
			else
				toppingValue -= topping;
		}
		
		total = sizeValue + toppingValue;
		System.out.println("\nsizeValue: " + sizeValue);
		System.out.println("total: " + total);
		field.setText("" + total);
	}
	public static void main(String[] args) {
		new JPizza();
	}
}
