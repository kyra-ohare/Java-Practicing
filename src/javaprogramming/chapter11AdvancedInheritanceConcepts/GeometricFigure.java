/*
 * Exercise 10, page 598.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts;

public abstract class GeometricFigure {
    int height;
    int width;
    String figureType;
    double area;
    
    public abstract void determineArea(int height, int width);
}