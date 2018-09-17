/*
 * Exercise 10, page 598.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts;

public class Triangle extends GeometricFigure {

    @Override
    public void determineArea(int height, int width) {
        figureType = "Triangle";

        double result = (height * width) / 2;
        System.out.println(figureType + ": " + result);
    }
}