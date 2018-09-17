/*
 * Exercise 9, page 541.
*/
package javaprogramming.chapter10Inheritance;

public class Vehicle {
    private int numberOfWheels;
    private int numberOfMiles;
    
    public Vehicle(int numberOfWheels, int numberOfMiles) {
        this.numberOfWheels = numberOfWheels;
        this.numberOfMiles = numberOfMiles;
    }
    
    @Override
    public String toString() {
        return "Number of Wheels: " + numberOfWheels + " Number of Miles: " + numberOfMiles;
    }
}