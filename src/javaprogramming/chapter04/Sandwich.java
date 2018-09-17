/*
 * Exercise 5, page 236.
 */
package javaprogramming.chapter04;

public class Sandwich{
	Bread bread;
	SandwichFilling filling;
	
	public Sandwich(String breadType, int breadCalory, String fillingType, int fillingCalory){
		bread = new Bread(breadType, breadCalory);
		filling = new SandwichFilling(fillingType, fillingCalory);
	}
	
	public void printSandwich(){
		bread.printBread();
		filling.printSandwichFilling();
	}
}