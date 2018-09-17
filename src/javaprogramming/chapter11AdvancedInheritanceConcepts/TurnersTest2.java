/*
 * Exercise 8b, page 597.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts;

public class TurnersTest2 {
    
    public static void main(String[] args) {
        Turner[] turners = new Turner[5];
        turners[0] = new Leaf();
        turners[1] = new Page();
        turners[2] = new Pancake();
        turners[3] = new Car();
        turners[4] = new Person();
        
        for(Turner temp : turners) {
            temp.turn();
        }
    }
}