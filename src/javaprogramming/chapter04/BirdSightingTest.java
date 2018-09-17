/*
 * Exercise 3, page 235.
 */
package javaprogramming.chapter04;

public class BirdSightingTest {
	public static void main(String[] args) {
		BirdSighting bs = new BirdSighting();
		bs.display();
		
		BirdSighting bs2 = new BirdSighting("swallow", 1000, 20);
		bs2.display();
	}

}
