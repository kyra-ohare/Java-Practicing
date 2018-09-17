/*
 * Exercise 5, page 596.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts;

public class ElementArrayTest {
    
    public static void main(String[] args) {
        Element[] elements = new Element[6];
        elements[0] = new MetalElement("Li", 2, 6.94);
        elements[1] = new NonMetalElement("C", 6, 12.011);
        elements[2] = new MetalElement("Au", 47, 107.87);
        elements[3] = new NonMetalElement("Br", 35, 79.904);
        elements[4] = new MetalElement("La", 57, 138.91);
        elements[5] = new NonMetalElement("O", 8, 15.999);
        
        for(Element temp : elements) {
            temp.describeElement();
        }
    }
}