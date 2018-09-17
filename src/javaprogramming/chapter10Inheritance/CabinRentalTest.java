/*
 * Exercise 5, page 540.
*/
package javaprogramming.chapter10Inheritance;

public class CabinRentalTest {

    public static void main(String[] args) {
        CabinRental[] cr = new CabinRental[5];
            cr[0] = new CabinRental(1);
            cr[1] = new CabinRental(2);
            cr[2] = new CabinRental(3);
            cr[3] = new CabinRental(4);
            cr[4] = new CabinRental(5);
        HolidayCabinRental[] hcr = new HolidayCabinRental[5];
            hcr[0] = new HolidayCabinRental(1, 1);
            hcr[1] = new HolidayCabinRental(2, 2);
            hcr[2] = new HolidayCabinRental(3, 3);
            hcr[3] = new HolidayCabinRental(4, 4);
            hcr[4] = new HolidayCabinRental(5, 5);
        
        System.out.println("Cabin Rental:");
        for(CabinRental temp : cr) {
            System.out.println("   Cabin Number: " + temp.getCabinNumber() + " Rental Rate: " + temp.getRentalRate());
        }
        
        System.out.println("Holiday Cabin Rental:");
        for(CabinRental temp : hcr) {
            System.out.println("   Cabin Number: " + temp.getCabinNumber() + " Rental Rate: " + temp.getRentalRate());
        }
    }
}