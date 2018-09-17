/*
 * Exercise 5, page 236.
 */
package javaprogramming.chapter04;

public class SandwichFillingTest{
	public static void main(String[] args){
		SandwichFilling sandwich1 = new SandwichFilling("Salmon", 400);
		SandwichFilling sandwich2 = new SandwichFilling("Turkey", 500);
		SandwichFilling sandwich3 = new SandwichFilling("Chicken", 600);
		
		sandwich1.printSandwichFilling();
		sandwich2.printSandwichFilling();
		sandwich3.printSandwichFilling();
	}
}