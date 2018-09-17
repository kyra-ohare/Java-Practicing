/*
 * Exercise 13, page 598.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts;

public class PartTime extends Student {

    @Override
    public void tuition() {
        isFullTime = false;
        System.out.println("Tuition credit hour fee: € 200");
    }
}