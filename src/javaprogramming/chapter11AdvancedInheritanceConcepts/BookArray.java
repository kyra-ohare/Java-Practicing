/*
 * Exercise 1, page 594.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts;

public class BookArray {

	public static void main(String[] args) {
		Fiction[] fictions = new Fiction[3];
		NonFiction[] nonFictions = new NonFiction[3];
		
		for(int i = 0; i < fictions.length; i++) {
			fictions[i] = new Fiction();
		}
		for(int i = 0; i < fictions.length; i++) {
			nonFictions[i] = new NonFiction();
		}
		
		fictions[0].setTitle("The family Adams");
		fictions[1].setTitle("Mamma Mia");
		fictions[2].setTitle("Spiderman");
		
		nonFictions[0].setTitle("Life is beautiful");
		nonFictions[1].setTitle("Wonderful");
		nonFictions[2].setTitle("It's a beautiful day");
		
		for(int i = 0; i < fictions.length; i++) {
			System.out.println(fictions[i].getTitle() + ": $" + fictions[i].getPrice());
		}
		
		System.out.println();
		
		for(int i = 0; i < nonFictions.length; i++) {
			System.out.println(nonFictions[i].getTitle() + ": $" + nonFictions[i].getPrice());
		}
	}

}
