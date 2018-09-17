/*
 * Exercise 1, page 594.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts;

public class UseBook {

    public static void main(String[] args) {
        Fiction book = new Fiction();
        NonFiction nonFiction = new NonFiction();

        System.out.println(book.getTitle() + ": $" + book.getPrice());
        System.out.println(nonFiction.getTitle() + ": $" + nonFiction.getPrice());

    }
}