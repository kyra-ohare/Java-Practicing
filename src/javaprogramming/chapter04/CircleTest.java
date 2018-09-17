/*
 * Exercise 6, page 236.
 */
package javaprogramming.chapter04;

public class CircleTest{
	public static void main(String[] args){
		Circle c1 = new Circle();
		Circle c2 = new Circle();
		Circle c3 = new Circle();
		
		c1.setRadius(2);
		c1.display();
		c2.setRadius(200);
		c2.display();
		
		c3.display();
	}
}