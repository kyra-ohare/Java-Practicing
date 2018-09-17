/*
 * Exercise 14, page 598.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts.com.course.buildings;

public class House extends Building {
    private int numOfBedrooms;
    private int numOfBaths;

    public int getNumOfBedrooms() {
        return numOfBedrooms;
    }

    public void setNumOfBedrooms(int numOfBedrooms) {
        this.numOfBedrooms = numOfBedrooms;
    }

    public int getNumOfBaths() {
        return numOfBaths;
    }

    public void setNumOfBaths(int numOfBaths) {
        this.numOfBaths = numOfBaths;
    }
}