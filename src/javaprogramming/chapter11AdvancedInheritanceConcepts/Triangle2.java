/*
 * Exercise 11, page 598.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts;

public class Triangle2 extends GeometricFigure2 {

    @Override
    public void setFigureType() {
        figureType = "Triangle";
    }
    
    @Override
    public void determineArea(int height, int width) {
        double result = (height * width) / 2;
        System.out.print(getFigureType() + ": " + result);
    }


    @Override
    public void displaySides() {
        System.out.println(". A " + getFigureType() + " has 3 sides.");
    }
}