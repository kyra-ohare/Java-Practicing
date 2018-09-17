/*
 * Exercise 3, page 595.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts;

public class Chevy extends Auto {

    @Override
    public void setPrice() {
        super.price = 22_000;
    }
}