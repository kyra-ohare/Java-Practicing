/*
 * Exercise 7, page 389.
 */
package javaprogramming.chapter07;

public class DemonstratingStringMethods {
	public static void main(String[] args) {
		String quote = "'You can never cross the ocean until you have the courage to lose sight of the shore.' - Christopher Columbus";
		System.out.println(quote);
		
		int v = quote.indexOf('v');
		System.out.println("index of v: " + v);
		int x = quote.indexOf('x');
		System.out.println("index of x: " + x);
		char c = quote.charAt(16);
		System.out.println("character at 16: " + c);
		boolean bus = quote.endsWith("bus");
		System.out.println("ends with bus: " + bus);
		boolean car = quote.endsWith("car");
		System.out.println("ends with car: " + car);
		String r = quote.replace('c', 'C');
		System.out.println("replace c for C: " + r);
	}
}
