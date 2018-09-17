/*
 * Exercise 8, page 597.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts;

public class Leaf implements Turner {

    @Override
    public void turn() {
        System.out.println("A leaf is changing colors.");
    }
    
}