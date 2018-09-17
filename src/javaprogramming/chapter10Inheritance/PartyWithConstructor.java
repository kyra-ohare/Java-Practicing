package javaprogramming.chapter10Inheritance;

public class PartyWithConstructor {
	private int guests;
	
	public PartyWithConstructor() {
		System.out.println("Creating a Party");
	}

	public int getGuests() {
		return guests;
	}

	public void setGuests(int guests) {
		this.guests = guests;
	}
	
	public void displayInvitation() {
		System.out.println("Please come to my party!");
	}
	
}
