/*
 * Exercise 5, page 540.
*/
package javaprogramming.chapter10Inheritance;

public class CabinRental {
    int cabinNumber;
    double rentalRate;
    
    public CabinRental(int cabinNumber) {
        this.cabinNumber = cabinNumber;
        switch(cabinNumber) {
            case 1:
            case 2:
            case 3:
                rentalRate = 950;
                break;
            default:
                rentalRate = 1100;
        }
    }
    
    public int getCabinNumber() {
        return cabinNumber;
    }

    public double getRentalRate() {
        return rentalRate;
    }
}