/*
 * Exercise 1, page 594.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts;

public class Fiction extends Book {

	public Fiction() {
		super("The Adventure of Gasper");
		setPrice();
	}

	@Override
	public void setPrice() {
		this.price = 24.99;
	}
	

}
