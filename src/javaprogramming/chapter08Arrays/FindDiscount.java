/*
 * Searching an Array for a Range Match
 */
package javaprogramming.chapter08Arrays;

import javax.swing.*;

public class FindDiscount {

	public static void main(String[] args) {
		final int NUM_RANGES = 5;
		int index = NUM_RANGES - 1;
		int[] discountRangeLimits = {1, 13, 50, 100, 200};
		double[] discountRates = {0, 0.10, 0.14, 0.18, 0.20};
		int numOrdered;
		double customerDiscount;
		
		numOrdered = Integer.parseInt(JOptionPane.showInputDialog(null, "How many itmes are ordered?"));
		while(index >= 0 && numOrdered < discountRangeLimits[index]) {
		System.out.println("index 1: " + index + " >= 0: "+ (index >= 0) + " -- " + numOrdered + " < discountRangeLimits[index]: " + (numOrdered < discountRangeLimits[index]));
			--index;
			System.out.println("index 2: " + index + " >= 0: "+ (index >= 0) + " -- " + numOrdered + " < discountRangeLimits[index]: " + (numOrdered < discountRangeLimits[index]));
			
		}
		customerDiscount = discountRates[index];
		JOptionPane.showMessageDialog(null, "Discount rate for " + numOrdered + " items is " + customerDiscount);
	}

}
