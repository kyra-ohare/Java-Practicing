/*
 * Exercise 7, page 541.
*/
package javaprogramming.chapter10Inheritance;

import java.util.Scanner;

public class CarRentalTest {
    public static void main(String[] args) {
        String name;
        String zipCode;
        String size_of_car;
        int rental_in_days;
        String choice;
        CarRental cr = null;
        LuxuryCarRental lcr = null;
        
        Scanner input = new Scanner(System.in);
        System.out.print("Name >>>> ");
            name = input.nextLine();
        System.out.print("Zip Code >>>> ");
            zipCode = input.nextLine();
        System.out.print("How many days? ");
            rental_in_days = input.nextInt();
            input.nextLine();
        System.out.print("Do you wish a Luxury Car (Y/N)? ");
            choice = input.nextLine();
        if(choice.charAt(0) == 'Y' || choice.charAt(0) == 'y') {
            size_of_car = "luxury";
            lcr = new LuxuryCarRental(name, zipCode, size_of_car, rental_in_days);
            lcr.display();
        } else {
            System.out.print("Type of car (economy / midsize / full size) >>>> ");
                size_of_car = input.nextLine();
            cr = new CarRental(name, zipCode, size_of_car, rental_in_days);
            cr.display();
        }
    }
}