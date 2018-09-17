/*
 * Exercise 11, page 598.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts;

public abstract class GeometricFigure2 implements SidedObject {
    int height;
    int width;
    String figureType;
    double area;
    
    public abstract void determineArea(int height, int width);
    
    public abstract void setFigureType();
    
    public String getFigureType() {
        return figureType;
    }
}