package javaprogramming.chapter14IntroductionToSwingComponents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class JPopulation extends JFrame implements ActionListener {
	FlowLayout flow = new FlowLayout();
	JLabel heading = new JLabel("Find out the population of Irish towns");
	
	String[] cities = {"Dublin", "Cork", "Galway", "Limerick", "Waterford", "Drogheda", "Swords"};
	int[] populations = {1173179, 208669, 94192, 79934, 53504, 40956, 39248};
	int population;
	JComboBox<Object> city = new JComboBox<Object>(cities);
	JTextField field = new JTextField(5);
	
	public JPopulation() {
		super("JPopulation");
		setSize(300, 100);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(flow);
		add(heading);
		add(city);
		city.addActionListener(this);
		add(field);
	}

	public void actionPerformed(ActionEvent e) {
		int option = city.getSelectedIndex();
		population = populations[option];
		field.setText("" + population);
		
	}
	
	public static void main(String[] args) {
		new JPopulation();
	}


}
