/*
 * Exercise 11, page 598.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts;

public class Square2 extends GeometricFigure2 {
    
    @Override
    public void setFigureType() {
        figureType = "Square";
    }
    
    @Override
    public void determineArea(int height, int width) {
        double result;
        if(height != 0)
            result =  height * height;
        else
            result = width * width;
        System.out.print(getFigureType() + ": " + result);
    }

    @Override
    public void displaySides() {
        System.out.println(". A " + getFigureType() + " has 4 sides.");
    }
}