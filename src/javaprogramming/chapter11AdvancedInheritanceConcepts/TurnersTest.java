/*
 * Exercise 8, page 597.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts;

public class TurnersTest {
    
    public static void main(String[] args) {
        Turner[] turners = new Turner[3];
        turners[0] = new Leaf();
        turners[1] = new Page();
        turners[2] = new Pancake();
        
        for(Turner temp : turners) {
            temp.turn();
        }
    }
}