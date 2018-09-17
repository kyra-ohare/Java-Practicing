/*
 * Exercise 5, page 596.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts;

public class NonMetalElement extends Element {

    public NonMetalElement(String symbol, int atomicNumber, double atomicWeight) {
        super(symbol, atomicNumber, atomicWeight);
    }

    @Override
    public void describeElement() {
        System.out.println("Non Metal Elements are poor conductors of electricity\nSymbol: " + getSymbol() + " | Atomic Number: " + getAtomicNumber() + " | Atomic Weight: " + getAtomicWeight() + "\n");
    }
    
}