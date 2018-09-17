/*
 * Exercise 8b, page 597.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts;

public class Person implements Turner {

    @Override
    public void turn() {
        System.out.println("People turn directions.");
    }
    
}