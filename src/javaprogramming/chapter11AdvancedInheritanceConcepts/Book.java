/*
 * Exercise 1, page 594.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts;

public abstract class Book {
	String title;
	double price;
	
	public Book(String title) {
		this.title = title;
	}

	public String getTitle() {
		return title;
	}
	
	public void setTitle(String title) {
		this.title = title;
	}

	public double getPrice() {
		return price;
	}
	
	public abstract void setPrice();
	
}
