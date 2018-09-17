/*
 * Exercise 11, page 598.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts;

public class GeometricTest2 {
    
    public static void main(String[] args) {
        GeometricFigure2[] geo = new GeometricFigure2[4];
        geo[0] = new Square2();
            geo[0].setFigureType();
            geo[0].determineArea(5, 0);
            geo[0].displaySides();
        geo[1] = new Triangle2();
            geo[1].setFigureType();
            geo[1].determineArea(5, 2);
            geo[1].displaySides();
        geo[2] = new Square2();
            geo[2].setFigureType();
            geo[2].determineArea(0, 10);
            geo[2].displaySides();
        geo[3] = new Triangle2();
            geo[3].setFigureType();
            geo[3].determineArea(6, 3);
            geo[3].displaySides();
    }
}