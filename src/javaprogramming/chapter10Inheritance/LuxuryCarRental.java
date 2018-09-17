/*
 * Exercise 7, page 541.
*/
package javaprogramming.chapter10Inheritance;

import java.util.Scanner;

public class LuxuryCarRental extends CarRental {
    double chauffeur = 200;
    String answer;
    Scanner input = new Scanner(System.in);
    
    public LuxuryCarRental(String rentersName, String zipCode, String size_of_car, int rental_in_days) {
        super(rentersName, zipCode, size_of_car, rental_in_days);
        dailyRentalFee = 79.99;
        total = rental_in_days * dailyRentalFee;
        System.out.print("Would you require a chauffeur? ");
        answer = input.nextLine();
        if(answer.charAt(0) == 'y' || answer.charAt(0) == 'Y') {
            total += chauffeur;
        }
    }
    
    @Override
    public void display() {
        super.display();
        System.out.println("\nPS: Amount above already includes Chauffeur fee (if hired) which is " + chauffeur + " per day.");
    }
}