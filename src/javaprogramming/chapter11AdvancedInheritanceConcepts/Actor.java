/*
 * Exercise 12, page 598.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts;

public class Actor implements Player {

    @Override
    public void play() {
        System.out.println("An actor is playing.");
    }
    
}