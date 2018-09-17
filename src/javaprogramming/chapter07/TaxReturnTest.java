/*
 * Exercise 13, page 391.
 */
package javaprogramming.chapter07;

import java.util.Scanner;

public class TaxReturnTest {
    public static void main(String[] args) {
        getTaxInfo();
    }
    
    public static void getTaxInfo() {
        StringBuilder SSN = null;
        String lastName;
        String firstName;
        String streetAddress;
        String city;
        String state;
        StringBuilder zipCode = null;
        double annualIncome;
        char maritalStatus;
        TaxReturn taxReturn = null;
        Scanner input = new Scanner(System.in);
        
        //Validate SSN 999-99-9999
        System.out.print("Enter Social Security Number >>>> ");
        SSN = new StringBuilder(input.nextLine());
        while(SSN.length() != 11 || SSN.charAt(3) != '-' || SSN.charAt(6) != '-') {
            System.out.print("Social Security Number contains 9 digits and dashes. Try again >>>> ");
            SSN = new StringBuilder(input.nextLine());
        }
        
        System.out.print("Enter last name >>>> ");
        lastName = input.nextLine();

        System.out.print("Enter first name >>>> ");
        firstName = input.nextLine();

        System.out.print("Enter street address >>>> ");
        streetAddress = input.nextLine();

        System.out.print("Enter city >>>> ");
        city = input.nextLine();

        System.out.print("Enter state >>>> ");
        state = input.nextLine().toUpperCase();

        System.out.print("Enter zip code >>>> ");
        zipCode = new StringBuilder(input.nextLine());
        while(zipCode.length() != 5) {
            System.out.print("Zip Code must contain 5 digits. Try again >>>> ");
            zipCode = new StringBuilder(input.nextLine());
        }
        
        System.out.print("Enter marital status >>>> ");
        maritalStatus = input.nextLine().toUpperCase().charAt(0);

        System.out.print("Enter annual income >>>> ");
        annualIncome = input.nextDouble();
        
        input.close();
        
        taxReturn = new TaxReturn(SSN, lastName, firstName, streetAddress, city, state, zipCode, annualIncome, maritalStatus);
    }
}