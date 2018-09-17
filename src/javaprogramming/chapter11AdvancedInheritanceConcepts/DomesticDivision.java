/*
 * Exercise 4, page 595.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts;

public class DomesticDivision extends Division {
    String state;
    
    public DomesticDivision(String state) {
        this.state = state;
    }
    
    @Override
    public void display() {
        System.out.println("Domestic Division\nState: " + state + "\n");
    }
    
}