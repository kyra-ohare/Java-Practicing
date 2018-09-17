/*
 * Exercise 12, page 598.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts;

public class Musician implements Player {

    @Override
    public void play() {
        System.out.println("A musician is playing.");
    }
    
}