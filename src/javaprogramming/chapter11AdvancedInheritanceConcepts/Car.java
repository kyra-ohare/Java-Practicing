/*
 * Exercise 8b, page 597.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts;

public class Car implements Turner {

    @Override
    public void turn() {
        System.out.println("You turn your car left or right.");
    }
    
}