/*
 * Exercise 10, page 598.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts;

public class GeometricTest {
    
    public static void main(String[] args) {
        GeometricFigure[] geo = new GeometricFigure[4];
        geo[0] = new Square();
            geo[0].determineArea(5, 0);
        geo[1] = new Triangle();
            geo[1].determineArea(5, 2);
        geo[2] = new Square();
            geo[2].determineArea(0, 10);
        geo[3] = new Triangle();
            geo[3].determineArea(6, 3);
    }
}