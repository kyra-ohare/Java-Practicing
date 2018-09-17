/*
 * Exercise 13, page 598.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts;

public class FullTime extends Student {

    @Override
    public void tuition() {
        isFullTime = true;
        System.out.println("Tuition flat fee: € 2,000");
    }
    
}