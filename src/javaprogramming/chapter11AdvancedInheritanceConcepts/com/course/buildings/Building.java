/*
 * Exercise 14, page 598.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts.com.course.buildings;

public abstract class Building {
    private double squareFootage;
    private int numOfStories;

    public double getSquareFootage() {
        return squareFootage;
    }

    public void setSquareFootage(double squareFootage) {
        this.squareFootage = squareFootage;
    }

    public int getNumOfStories() {
        return numOfStories;
    }

    public void setNumOfStories(int numOfStories) {
        this.numOfStories = numOfStories;
    }
    
    
}