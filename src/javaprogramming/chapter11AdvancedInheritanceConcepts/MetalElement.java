/*
 * Exercise 5, page 596.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts;

public class MetalElement extends Element {

    public MetalElement(String symbol, int atomicNumber, double atomicWeight) {
        super(symbol, atomicNumber, atomicWeight);
    }

    @Override
    public void describeElement() {
        System.out.println("Metal Elements are good conductors of electricity\nSymbol: " + getSymbol() + " | Atomic Number: " + getAtomicNumber() + " | Atomic Weight: " + getAtomicWeight() + "\n");
    }
    
}