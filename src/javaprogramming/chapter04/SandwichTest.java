/*
 * Exercise 5, page 236.
 */
package javaprogramming.chapter04;

public class SandwichTest{
	public static void main(String[] args){
		Sandwich sandwich1 = new Sandwich("Rye", 500, "Chicken", 1000);
		sandwich1.printSandwich();
		
		Sandwich sandwich2 = new Sandwich("Wheat", 10, "Turkey", 950);
		sandwich2.printSandwich();
		
		Sandwich sandwich3 = new Sandwich("Pitta", 250, "Tuna", 600);
		sandwich3.printSandwich();
	}
}