package javaprogramming.chapter14IntroductionToSwingComponents;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class JTunes2 extends JFrame implements ActionListener {
	final int WIDTH = 400;
	final int HEIGHT = 200;
	
	JPanel panel1 = new JPanel();
	JPanel panel2 = new JPanel();
	JPanel panel3 = new JPanel();
	
	JLabel option = new JLabel("Choose a song");
	JLabel total = new JLabel("");
	
	Font font = new Font("Arial", Font.BOLD, 16);
	GridLayout grid = new GridLayout(3, 1);
	Container con = new Container();
	
	String[] songs = {"Almighty","Peace Be Still", "Redemed", "What a Beautiful Name", "Zeal", "Forever", "Here in Your Love", "Make Us One", "Floodgates", "Nobody", "Fall Afresh", "White Flag", "Take All of Me", "You're Not Finished Yet", "Halls of Heaven", "Closer to Your Heart", "Love at the End", "Alive Again", "Hands to the Heavens", "God of this City"};
	
	JComboBox<Object> box = new JComboBox<Object>(songs);
	
	double price;
	double[] prices = {5.50, 8.95, 7.40, 9.99, 14.50, 5.80, 10.75, 12.99, 7.90, 13.25, 7.60, 9.45, 5.20, 16, 12.25, 19.99, 4.50, 8.90, 6.40, 10};

	public JTunes2() {
		super("Tunes");
		setSize(WIDTH, HEIGHT);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setVisible(true);
		
		Container con = getContentPane();
		
		con.setLayout(grid);
		con.add(panel1);
			panel1.setBackground(Color.WHITE);
			panel1.add(option);

		con.add(panel2);
			panel2.setBackground(Color.WHITE);
			panel2.add(box);
			box.setEditable(true);
			box.setSelectedIndex(7);
			box.addActionListener(this);
		
		con.add(panel3);
		panel3.setBackground(Color.BLACK);
			panel3.add(total);
			total.setFont(font);
			total.setForeground(Color.WHITE);
			
		validate();
		repaint();
	}
	
	public void actionPerformed(ActionEvent e) {
		int chosen = box.getSelectedIndex();
		price = prices[chosen];
		total.setText("Selected song costs: $ " + price);
	}
	
	public static void main(String[] args) {
		new JTunes2();
	}
}
