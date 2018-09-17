package javaprogramming.chapter12ExceptionHandling;

import javax.swing.*;

public class PlanVegetarianMenu {

	public static void main(String[] args) {
		VegetarianMenu briefMenu = new VegetarianMenu();
		PickMenu2 entree = null;
		String guestChoice = new String();
		
		try {
			PickMenu2 selection = new PickMenu2(briefMenu);
			entree = selection;
			guestChoice = entree.getGuestChoice();
		}catch (MenuException error) {
			guestChoice = error.getMessage();
		}catch (Exception error) {
			guestChoice = "an invalid vegetarian selection.";
		}
		
		JOptionPane.showMessageDialog(null, "You chose " + guestChoice);
	}

}
