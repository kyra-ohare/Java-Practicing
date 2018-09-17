package javaprogramming.chapter14IntroductionToSwingComponents;

import java.awt.FlowLayout;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class JDorms extends JFrame implements ItemListener {
	JLabel label = new JLabel("***** Make your choices *****");
	JTextArea textArea  = new JTextArea(5, 20);
	
	JCheckBox privateRoom = new JCheckBox("Private Room");
	JCheckBox internetConnection = new JCheckBox("Internet Connection");
	JCheckBox cableTV = new JCheckBox("Cable TV");
	JCheckBox microwave = new JCheckBox("Microwave");
	JCheckBox refrigerator = new JCheckBox("Refrigerator");
	JCheckBox washingMachine = new JCheckBox("Washing Machine");
	JCheckBox dishwasher = new JCheckBox("Dishwasher");
	JCheckBox kettle = new JCheckBox("Ketlle");
	JCheckBox vacuumCleaner = new JCheckBox("Vacuum Cleaner");
	
	public JDorms() {
		super("JDorms");
		setSize(250, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		setLayout(new FlowLayout());
		
		add(label);
		add(privateRoom);
		add(internetConnection);
		add(cableTV);
		add(microwave);
		add(refrigerator);
		add(washingMachine);
		add(dishwasher);
		add(kettle);
		add(vacuumCleaner);
		add(textArea);
		
		privateRoom.addItemListener(this);
		internetConnection.addItemListener(this);
		cableTV.addItemListener(this);
		microwave.addItemListener(this);
		refrigerator.addItemListener(this);
		washingMachine.addItemListener(this);
		dishwasher.addItemListener(this);
		kettle.addItemListener(this);
		vacuumCleaner.addItemListener(this);

		validate();
		repaint();
	}
	public void itemStateChanged(ItemEvent e) {
		Object source = e.getSource();
		int select = e.getStateChange();
		
		if(source == privateRoom) {
			if(select == ItemEvent.SELECTED)
				textArea.append("Private room\n");
			else if(select == ItemEvent.DESELECTED)
				textArea.remove(privateRoom);
		}
		if(source == internetConnection) {
			if(select == ItemEvent.SELECTED)
				textArea.append("Internet Connection\n");
			else
				textArea.setText("");
		}
		if(source == cableTV) {
			if(select == ItemEvent.SELECTED)
				textArea.append("Cable TV\n");
		}
		if(source == microwave) {
			if(select == ItemEvent.SELECTED)
				textArea.append("Microwave\n");
		}
		if(source == refrigerator) {
			if(select == ItemEvent.SELECTED)
				textArea.append("Refrigerator\n");
		}
		if(source == washingMachine) {
			if(select == ItemEvent.SELECTED)
				textArea.append("Washing Machine\n");
		}
		if(source == dishwasher) {
			if(select == ItemEvent.SELECTED)
				textArea.append("Dishwasher\n");
		}
		if(source == kettle) {
			if(select == ItemEvent.SELECTED)
				textArea.append("Kettle\n");
		}
		if(source == vacuumCleaner) {
			if(select == ItemEvent.SELECTED)
				textArea.append("Vacuum Cleaner\n");
		}
	}
	public static void main(String[] args) {
		new JDorms();
	}
}