package javaprogramming.chapter14IntroductionToSwingComponents;

import java.awt.*;
import javax.swing.*;
import java. awt.event.*;

@SuppressWarnings("serial")
public class CheckBoxDemonstration extends JFrame implements ItemListener {
	FlowLayout flow = new FlowLayout();
	JLabel label = new JLabel("What would you like to drink?");
	ButtonGroup group = new ButtonGroup();
	
	JCheckBox coffee = new JCheckBox("Coffee", false);
	JCheckBox cola = new JCheckBox("Cola", false);
	JCheckBox milk = new JCheckBox("Milk", false); //selected
	JCheckBox water = new JCheckBox("Water", false);
	String ouput, insChosen;
	
	public CheckBoxDemonstration() {
		super("CheckBox Demonstration");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(flow); //???????????????
		label.setFont(new Font("Arial", Font.ITALIC, 22));
		coffee.addItemListener(this);
		cola.addItemListener(this);
		milk.addItemListener(this);
		water.addItemListener(this);

		group.add(coffee);
		group.add(cola);
		group.add(milk);
		group.add(water);
		
		/*add(label);
		add(coffee);
		add(cola);
		add(milk);
		add(water);*/
		
		//group.setSelected(coffee, true);
		
	}
	@Override
	public void itemStateChanged(ItemEvent check) {
		Object source = check.getItem();
		int select = check.getStateChange();
		
		if(source == coffee) {
			if(select == ItemEvent.SELECTED)
				System.out.println("Coffee selected");
			else
				System.out.println("Coffee deselected");
		} else if (source == cola){
			if(select == ItemEvent.SELECTED)
				System.out.println("Cola selected");
			else
				System.out.println("Cola deselected");
		} else if (source == milk){
			if(select == ItemEvent.SELECTED)
				System.out.println("Milk selected");
			else
				System.out.println("Milk deselected");
		} else {
			if(select == ItemEvent.SELECTED)
				System.out.println("Water selected");
			else
				System.out.println("Water deselected");
		}
			
	}
	
	public static void main(String[] args) {
		final int WIDTH = 350;
		final int HEIGHT = 120;
		JCheckBoxDemo frame = new JCheckBoxDemo();
		frame.setSize(WIDTH, HEIGHT);
		frame.setVisible(true);
	}
	
}
