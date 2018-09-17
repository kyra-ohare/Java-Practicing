/*
 * Exercise 8, page 597.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts;

public class Page implements Turner {

    @Override
    public void turn() {
        System.out.println("You are going to the next page.");
    }
    
}