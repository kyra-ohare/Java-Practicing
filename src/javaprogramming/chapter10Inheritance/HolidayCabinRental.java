/*
 * Exercise 5, page 540.
*/
package javaprogramming.chapter10Inheritance;

public class HolidayCabinRental extends CabinRental {
    double surcharge = 150;
    
    public HolidayCabinRental(int cabinRental, int roomNumber) {
        super(cabinRental);
        super.rentalRate += surcharge;
    }
}