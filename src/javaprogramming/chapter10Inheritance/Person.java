/*
 * Exercise 10, page 542.
*/
package javaprogramming.chapter10Inheritance;

import java.util.Scanner;

public class Person {
    private String firstName;
    private String lastName;
    private String streetAddress;
    private String zipCode;
    private String phoneNumber;
    Scanner input = new Scanner(System.in);
    
    public void settingData() {
        System.out.print("First Name >>>> ");
            firstName = input.nextLine().toUpperCase();
        System.out.print("Last Name >>>> ");
            lastName = input.nextLine().toUpperCase();
        System.out.print("Street Address >>>> ");
            streetAddress = input.nextLine().toUpperCase();
        System.out.print("Zip Code >>>> ");
            zipCode = input.nextLine();
        System.out.print("Phone Number >>>> ");
            phoneNumber = input.nextLine();
    }
    
    public void displayInfo() {
        System.out.println("First Name: " + firstName + " Last Name: " + lastName + "\nStreet Address: " + streetAddress + ", " + zipCode + " Phone Number: " + phoneNumber);
    }
}