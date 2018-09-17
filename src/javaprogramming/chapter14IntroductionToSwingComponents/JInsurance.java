package javaprogramming.chapter14IntroductionToSwingComponents;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

@SuppressWarnings("serial")
public class JInsurance extends JFrame implements ItemListener {
	final double hmoPrice = 200;
	final double pdoPrice = 600;
	final double dentalPrice = 75;
	final double visionPrice = 20;
	double planValue = 0;
	double extraValue = 0;
	double total = 0;
	
	GridLayout mainGrid = new GridLayout(3, 2);
	Container con = getContentPane();
	
	JPanel pan1 = new JPanel();
	JPanel pan2 = new JPanel();
	JPanel pan3 = new JPanel();
	JPanel pan4 = new JPanel();
	JPanel pan5 = new JPanel();
	JPanel pan6 = new JPanel();
	
	JLabel plan = new JLabel("Choose your plan");
	JLabel additional = new JLabel("Any additional plans?");
	JLabel chosenOrgatization = new JLabel("Chosen Organization");
	JLabel extra = new JLabel("Chosen Additional Plan");
	JLabel totalLabel = new JLabel("Total per month ----------------->");
	JLabel emptyLabel = new JLabel("");
	JLabel emptyLabel2 = new JLabel("");
	
	ButtonGroup group = new ButtonGroup();
	JCheckBox hmo = new JCheckBox("Health Maintenance Organization");
	JCheckBox pdo = new JCheckBox("Preferred Provided Organization");
		JTextField orgField = new JTextField(15);
	JCheckBox dental = new JCheckBox("Dental Insurance");
		JTextField dentalField = new JTextField(15);
	JCheckBox vision = new JCheckBox("Vision Insurance");
		JTextField visionField = new JTextField(15);
	
	JTextField totalField = new JTextField(20);
	
	public JInsurance() {
		super("Insurance");
		setSize(500, 400);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		con.setLayout(mainGrid);
		con.add(pan1);
			pan1.add(plan);
			pan1.add(emptyLabel);
			pan1.add(pdo);
			pan1.add(hmo);
				group.add(pdo);
				group.add(hmo);
				pdo.addItemListener(this);
				hmo.addItemListener(this);
		con.add(pan2);
			pan2.add(emptyLabel2);
			pan2.add(chosenOrgatization);
			pan2.add(orgField);
		con.add(pan3);
			pan3.add(additional);
			pan3.add(emptyLabel2);
			pan3.add(dental);
			pan3.add(vision);
				dental.addItemListener(this);
				vision.addItemListener(this);
		con.add(pan4);
			pan4.add(extra);
			pan4.add(dentalField);
			pan4.add(visionField);
		con.add(pan5);
			pan5.add(totalLabel);
		con.add(pan6);
			pan6.add(totalField);
		
		validate();
		repaint();
	}
	public void itemStateChanged(ItemEvent e) {
		Object source = e.getSource();
		int select = e.getStateChange();
		
		if(source == pdo) {
			if(select == ItemEvent.SELECTED) {
				orgField.setText("PDO - $ " + pdoPrice);
				planValue += pdoPrice;
			} else
				planValue -= pdoPrice;
		}
		if(source == hmo) {
			if(select == ItemEvent.SELECTED) {
				orgField.setText("HMO - $ " + hmoPrice);
				planValue += hmoPrice;
			} else
				planValue -= hmoPrice;
		}
		
		if(source == dental) {
			if(select == ItemEvent.SELECTED) {
				dentalField.setText("Dental plan - $ " + dentalPrice);
				extraValue += dentalPrice;
			} else {
				dentalField.setText("");
				extraValue -= dentalPrice;
			}
		}
		if(source == vision) {
			if(select == ItemEvent.SELECTED) {
				visionField.setText("Vision plan - $ " + visionPrice);
				extraValue += visionPrice;
			} else {
				visionField.setText("");
				extraValue -= visionPrice;
			}
		}
		
		total = planValue + extraValue; 
		totalField.setText("Total per month: $ " + total);
	}
	public static void main(String[] args) {
		new JInsurance();
	}
}
