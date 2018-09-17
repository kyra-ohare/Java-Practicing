/*
 * Exercise 3, page 595.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts;

public class Ford extends Auto {

    @Override
    public void setPrice() {
        super.price = 20_000;
    }
}