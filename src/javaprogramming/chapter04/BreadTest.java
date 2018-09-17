/*
 * Exercise 5, page 236.
 */
package javaprogramming.chapter04;

public class BreadTest{
	public static void main(String[] args){
		Bread bread1 = new Bread("Rye", 500);
		Bread bread2 = new Bread("Sweet", 1000);
		Bread bread3 = new Bread("Wheat", 10);
		
		bread1.printBread();
		//bread1.setBreadType("Pitta");
		bread1.printBread();
		bread2.printBread();
		bread3.printBread();
	}
}