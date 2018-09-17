/*
 * Exercise 7, page 541.
*/
package javaprogramming.chapter10Inheritance;

public class CarRental {
    String rentersName;
    String zipCode;
    String size_of_car;
    double dailyRentalFee;
    int rental_in_days; //length
    double total;
    
    public CarRental(String rentersName, String zipCode, String size_of_car, int rental_in_days) {
        this.rentersName = rentersName;
        this.zipCode = zipCode;
        this.size_of_car = size_of_car;
        this.rental_in_days = rental_in_days;
        switch(size_of_car) {
            case "economy":
                dailyRentalFee = 29.99;
                break;
            case "midsize":
                dailyRentalFee = 38.99;
                break;
            case "full size":
                dailyRentalFee = 43.50;
                break;
            default:
                break;
        }
        total = rental_in_days * dailyRentalFee;
    }
    
    public void display() {
        System.out.println("Renter's Name: " + rentersName + " Zip Code: " + zipCode + "\nSize of Car: " + size_of_car + "\nDaily Rental Fee: " + dailyRentalFee + " Rental in Days : " + rental_in_days + "\nTotal: " + total);
    }
    
    
}