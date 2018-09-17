/*
 * Exercise 1, page 594.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts;

public class NonFiction extends Book {

	public NonFiction() {
		super("Chico Xavier");
		setPrice();
	}

	@Override
	public void setPrice() {
		this.price = 37.99;
	}

}
