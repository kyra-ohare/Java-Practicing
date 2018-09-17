package javaprogramming.chapter15AdvancedGUITopics;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

@SuppressWarnings("serial")
public class JDemoFlowLayout extends JFrame implements ActionListener {
	private JButton lb = new JButton("L Button");
	private JButton cb = new JButton("C Button");
	private JButton rb = new JButton("R Button");

	private Container con = getContentPane();
	private FlowLayout layout = new FlowLayout();
	
	public JDemoFlowLayout() {
		con.setLayout(layout);
		con.add(lb);
		con.add(cb);
		con.add(rb);
		lb.addActionListener(this);
		cb.addActionListener(this);
		rb.addActionListener(this);
		
		setSize(2000, 100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new JDemoFlowLayout();
	}

	@Override
	public void actionPerformed(ActionEvent event) {
		Object source = event.getSource();
		
		if(source == lb)
			layout.setAlignment(FlowLayout.LEFT);
		else
			if(source == cb)
				layout.setAlignment(FlowLayout.CENTER);
		else
			layout.setAlignment(FlowLayout.RIGHT);
		
		con.invalidate();
		con.validate();
	}
}
