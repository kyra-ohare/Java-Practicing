/*
 * Exercise 11, page 173.
 */
package javaprogramming.chapter03;

public class Sandwich{
	String ingredient;
	String bread;
	double price;
	
	public Sandwich() {
		ingredient = "tuna";
		bread = "wheat";
		price = 4.99;
	}
	
	public String getIngredient() {
		return ingredient;
	}
	
	public void setIngredient(String ingredient) {
		this.ingredient = ingredient;
	}
	
	public String getBread() {
		return bread;
	}
	
	public void setBread(String bread) {
		this.bread = bread;
	}
	
	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
	
	public void display() {
		System.out.println("Ingredient: " + getIngredient()
		+ "\nBread: " + getBread() + "\nPrice: " + getPrice());
	}
}