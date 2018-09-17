package javaprogramming.chapter09Arrays;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

public class ArrayListDemo2 {

	public static void main(String[] args) {
		ArrayList<String> students = new ArrayList<String>();
		String name;
		final int LIMIT = 4;
		
		for(int x = 0; x < LIMIT; ++x) {
			name = JOptionPane.showInputDialog(null, "Enter a student's name", "Hello", JOptionPane.INFORMATION_MESSAGE);
			students.add(name);
		}
		Collections.sort(students); //method used to sort an ArrayList.
		JOptionPane.showMessageDialog(null, "The names are " + students, "Report", JOptionPane.NO_OPTION);
	}

}
