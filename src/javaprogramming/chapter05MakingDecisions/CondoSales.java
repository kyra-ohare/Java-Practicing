/*
 * Exercise 2, page 291.
 */
package javaprogramming.chapter05MakingDecisions;

import javax.swing.JOptionPane;

public class CondoSales {
	public static void main(String[] args) {
		byte code;
		byte codeGarage;
		double price;
		double priceGarage = 5000;
		double total;
		String view;
		String garage;
		
		code = Byte.parseByte(JOptionPane.showInputDialog(null, "Enter the code for the wished view"));
		if(code == 1) {
			view = "Park View";
			price = 150000;
		}else
			if(code == 2) {
				view = "Golf Course View";
				price = 170000;
			}else
				if(code == 3) {
					view = "Lake View";
					price = 210000;
				}else {
					view = "Invalid Code";
					price = 0;
				}
		
		codeGarage =  Byte.parseByte(JOptionPane.showInputDialog(null, "Enter the code for the wished garage"));
		switch(codeGarage) {
		case 1:
			garage = "Garage";
			break;
		case 2:
			garage = "Parking Space";
			break;
		default:
			garage = "No garage chosen";
			priceGarage = 0;
			break;
		}
		
		total = price + priceGarage;
		
		JOptionPane.showMessageDialog(null, "Apartment View: " + view + 
				"\nPrice: " + price + 
				"\nGarage: " + garage +
				"\nGarage Price: " + priceGarage + 
				"\n\nTotal: " + total);
	}

}
