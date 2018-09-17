/*
 * Exercise 8, page 597.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts;

public class Pancake implements Turner {

    @Override
    public void turn() {
        System.out.println("Flipping a pancake.");
    }
    
}