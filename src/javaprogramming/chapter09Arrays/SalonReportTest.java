/*
 * Exercise 7, page 493.
 */
package javaprogramming.chapter09Arrays;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SalonReportTest {
    public static void main(String[] args) {
        int choice;
        String answer;
        Scanner input = new Scanner(System.in);
        SalonReport temp = null;
        SalonReport[] services = new SalonReport[6];
            services[0] = new SalonReport("Cut", 8.00, 15);
            services[1] = new SalonReport("Shampoo", 4.00, 10);
            services[2] = new SalonReport("Manicure", 18.00, 30);
            services[3] = new SalonReport("Style", 48.00, 55);
            services[4] = new SalonReport("Permanent", 18.00, 35);
            services[5] = new SalonReport("Trim", 6.00, 5);
            
        do {
            System.out.print("Sort services by (1) Description; (2) Price or (3) Time? ");
            try {
                choice = input.nextInt();
                input.nextLine();
            } catch(InputMismatchException e) {
                System.out.println("Digits only!");
                break;
            }
            switch(choice) { //Sort by
                case 1: //Description
                    for(int i = 0; i < services.length-1; ++i) {
                        for(int j = 0; j < services.length-1; ++j) {
                            if(services[j].getDescription().compareTo(services[j+1].getDescription()) > 0) {
                                temp = services[j];
                                services[j] = services[j + 1];
                                services[j + 1] = temp;
                            }
                        }
                    }
                    break;
                case 2: //Price
                    for(int i = 0; i < services.length-1; ++i) {
                        for(int j = 0; j < services.length-1; ++j) {
                            if(services[j].getPrice() > services[j+1].getPrice()) {
                                temp = services[j];
                                services[j] = services[j + 1];
                                services[j + 1] = temp;
                            }
                        }
                    }
                    break;
                case 3: //Time
                    for(int i = 0; i < services.length-1; ++i) {
                        for(int j = 0; j < services.length-1; ++j) {
                            if(services[j].getTime() > services[j+1].getTime()) {
                                temp = services[j];
                                services[j] = services[j + 1];
                                services[j + 1] = temp;
                            }
                        }
                    }
                    break;
            }
            for(SalonReport sr : services) {
                sr.display();
            }
            
            System.out.print("\nDo you wish to continue (Y/N)? ");
            answer = input.nextLine();
        } while(answer.charAt(0) == 'y' || answer.charAt(0) == 'Y');
        System.out.println("Bye");
    }
}
