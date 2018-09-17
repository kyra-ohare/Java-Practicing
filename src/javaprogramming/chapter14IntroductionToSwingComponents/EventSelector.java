package javaprogramming.chapter14IntroductionToSwingComponents;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.Color.*;

@SuppressWarnings("serial")
public class EventSelector extends JFrame implements ActionListener {
	private JMenuBar mainBar = new JMenuBar();
	
	private JMenu file = new JMenu("File");
		private JMenuItem exit = new JMenuItem("Exit");

	private JMenu event = new JMenu("Event types");
		private JMenu adult = new JMenu("Adult");
			private JMenuItem adultBirthday = new JMenuItem("Birthday");
			private JMenuItem anniversary = new JMenuItem("Anniversary");
			private JMenuItem retirement = new JMenuItem("Retirement");
			private JMenuItem adultOther = new JMenuItem("Other");
		private JMenu child = new JMenu("Child");
			private JMenuItem childBirthday = new JMenuItem("Birthday");
			private JMenuItem childOther = new JMenuItem("Other");
			
	private JPanel birthdayPanel = new JPanel();
	private JPanel otherPanel = new JPanel();
	private JLabel birthdayLabel = new JLabel("Birthday events are our specialty");
	private JLabel otherLabel = new JLabel("We have lots of ideas for memorable events");
	private JPanel buttonPanel = new JPanel();
		private JRadioButton radButton1 = new JRadioButton("Formal events");
		private JRadioButton radButton2 = new JRadioButton("Casual events");
	
	public EventSelector() {
		setTitle("Event Selector");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLayout(new FlowLayout());
		composeMenus();
		addActionListeners();
		layoutComponents();
	}
	
	public void composeMenus() {
		setJMenuBar(mainBar);
			mainBar.add(file);
				file.add(exit);
			mainBar.add(event);
				event.add(adult);
					adult.add(adultBirthday);
					adult.add(anniversary);
					adult.add(retirement);
					adult.add(adultOther);
				event.add(child);
					child.add(childBirthday);
					child.add(childOther);
	}
	
	private void addActionListeners() {
		exit.addActionListener(this);
		
		adultBirthday.addActionListener(this);
		anniversary.addActionListener(this);
		retirement.addActionListener(this);
		adultOther.addActionListener(this);
		
		childBirthday.addActionListener(this);
		childOther.addActionListener(this);
	}
	
	private void layoutComponents() {
		birthdayPanel.setLayout(new FlowLayout());
			birthdayPanel.add(birthdayLabel);	//add label to panel
				add(birthdayPanel);				//add panel to frame
		otherPanel.setLayout(new GridLayout(2, 1, 3, 3));
			otherPanel.add("other", otherLabel);
			otherPanel.add("buttons", buttonPanel);
				buttonPanel.add(radButton1);
				buttonPanel.add(radButton2);
					add(otherPanel);
	}
	
	public void actionPerformed(ActionEvent e) {
		Object source = e.getSource();
		Container con = getContentPane();
		
		if(source == exit)
			System.exit(0);
		else if(source == childBirthday || source == childOther)
			con.setBackground(Color.PINK);
		else
			con.setBackground(Color.WHITE);
		
		if(source == adultBirthday || source == childBirthday) {
			birthdayPanel.setBackground(Color.yellow);
			otherPanel.setBackground(Color.white);
		} else {
			birthdayPanel.setBackground(Color.white);
			otherPanel.setBackground(Color.yellow);
		}
	}
	
	public static void main(String[] args) {
		EventSelector frame = new EventSelector();
		final int WIDTH = 400;
		final int HEIGHT = 200;
		frame.setSize(WIDTH, HEIGHT);
		frame.setVisible(true);
	}
	
}
