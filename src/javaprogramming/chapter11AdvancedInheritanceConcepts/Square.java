/*
 * Exercise 10, page 598.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts;

public class Square extends GeometricFigure {
    
    @Override
    public void determineArea(int height, int width) {
        figureType = "Square";
        double result;
        if(height != 0)
            result =  height * height;
        else
            result = width * width;
        System.out.println(figureType + ": " + result);
    }
}