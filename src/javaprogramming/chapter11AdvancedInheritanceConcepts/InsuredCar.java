package javaprogramming.chapter11AdvancedInheritanceConcepts;

import javax.swing.*;

public class InsuredCar extends Vehicle implements Insured {
	private int coverage;
	
	public InsuredCar() {
		super("gas", 4);
		setCoverage();
	}

	@Override
	public void setCoverage() {
		coverage = (int)(getPrice() * 0.9);
	}

	@Override
	public int getCoverage() {
		return coverage;
	}

	@Override
	public void setPrice() {
		String entry;
		final int MAX = 60000;
		entry = JOptionPane.showInputDialog(null, "Enter car price");
		price = Integer.parseInt(entry);
		if(price > MAX)
			price = MAX;
	}
	
	public String toString() {
		return("The insured car is powered by " + getPowerSource() + "; it has " + getWheels() + " wheels, costs $" + getPrice() + " and is insured for $" + getCoverage());
	}
}
