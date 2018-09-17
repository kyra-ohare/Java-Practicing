package javaprogramming.chapter09Arrays;

import javax.swing.*;

public class FindRend {
	static int floor;
	static int bedrooms;
	
	public static void main(String[] args) {
		int[][] rents = {{400, 450, 510},
						{500, 560, 630},
						{625, 676, 740},
						{1000, 1250, 1600}};
		
		//gui(rents);
		displayRents(rents);
	}
	
	public static void gui(int[][] arr) {
		String entry;
		entry = JOptionPane.showInputDialog(null, "Enter a floor number (0-3)");
		floor = Integer.parseInt(entry);
		entry = JOptionPane.showInputDialog(null, "Enter number of bedrooms (0-2)");
		bedrooms = Integer.parseInt(entry);
		JOptionPane.showMessageDialog(null, "The rent for a " + bedrooms + " bedroom apartment on floor " + floor + " is $" + arr[floor][bedrooms] + ".");		
	}
	
	public static void displayRents(int[][] arr) {
		for(floor = 0; floor < arr.length; ++floor) {
			for(bedrooms = 0; bedrooms < arr[floor].length; ++ bedrooms) {
				System.out.println("Floor " + floor + " > Bedrooms " + bedrooms + " >> Rent is $" + arr[floor][bedrooms]);
			}
		}
	}
}
