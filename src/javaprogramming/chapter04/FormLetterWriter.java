/*
 * Exercise 1, page 234.
 */
package javaprogramming.chapter04;

public class FormLetterWriter{
	static String lastName;
	static String firstName;
	
	public static void displaySalutation(String lN){
		lastName = lN;
		System.out.println("Dear Mr. or Ms. " + lastName);
	}
	public static void displaySalutation(String fN, String lN){
		firstName = fN;
		lastName = lN;
		System.out.println("Dear " + firstName + " " + lastName);
	}
	
	public static void display(){
		System.out.println("Thank you for your recent order.");
	}
	
	public static void main(String[] args){
		displaySalutation("Thompson");
		display();
		
		displaySalutation("John", "Green");
		display();
	}
}