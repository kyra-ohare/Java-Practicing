package javaprogramming.chapter10Inheritance;

public class DinnerParty2 extends Party { //extends Party has number of guests
	private int dinnerChoice;
	
	public int getDinnerChoice() {  
		return dinnerChoice;
	}

	public void setDinnerChoice(int dinnerChoice) {
		this.dinnerChoice = dinnerChoice;
	}
	
	public void displayInvitation() {
		System.out.println("Please come to my dinner party!");
	}
}
