/*
 * Exercise 5, page 236.
 */
package javaprogramming.chapter04;

public class SandwichFilling{
	String filling;
	int caloryPerServe;
	
	public SandwichFilling(String filling, int caloryPerServe){
		this.filling = filling;
		this.caloryPerServe = caloryPerServe;
	}
	
	public String getFilling(){
		return filling;
	}
	
	public int getCaloryPerServe(){
		return caloryPerServe;
	}
	
	public void printSandwichFilling(){
		System.out.println("Sandwich filling: " + filling);
		System.out.println("Calory per serve: " + caloryPerServe);
		System.out.println();
	}
}