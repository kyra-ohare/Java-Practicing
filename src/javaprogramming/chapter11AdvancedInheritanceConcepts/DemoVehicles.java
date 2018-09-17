package javaprogramming.chapter11AdvancedInheritanceConcepts;

import javax.swing.*;

public class DemoVehicles {
	public static void main(String[] args) {
		Bicycle aBike = new Bicycle();
		Sailboat aBoat = new Sailboat();
		
		JOptionPane.showMessageDialog(null, "\nVehicle descriptions:\n" + aBoat.toString() + "\n" + aBike.toString());
		
	}
}
