/*
 * Exercise 6, page 596.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts;

import java.util.InputMismatchException;
import java.util.Scanner;

public class SubscribersTest {
    
    public static void main(String[] args) {
        String streetAddress;
        int service, index = 0, counter;
        NewspaperSubscriber[] subs = new NewspaperSubscriber[3];
        Scanner input = new Scanner(System.in);
        
        while(index < subs.length) {
            System.out.print("Enter subscriber's address >>>> ");
            streetAddress = input.nextLine();
            counter = 0;
            for(NewspaperSubscriber temp : subs) {
                if(temp != null && temp.equals(streetAddress)) {
                    System.out.println("ERROR: Subscription already exists.");
                    break;
                } else
                    ++counter;
                
                if(counter == subs.length) {
                    System.out.print("Which type of subscriber? (1) Weekday, (2) Weekend or (3) 7-Day >>>> ");
                    try {
                        service = input.nextInt();
                        input.nextLine();
                        switch(service) {
                            case 1:
                                subs[index] = new WeekdaySubscriber();
                                subs[index].setAddress(streetAddress);
                            ++index;
                                break;
                            case 2:
                                subs[index] = new WeekendSubscriber();
                                subs[index].setAddress(streetAddress);
                                ++index;
                                break;
                            case 3:
                                subs[index] = new SevenDaySubscriber();
                                subs[index].setAddress(streetAddress);
                                ++index;
                                break;
                            default:
                                System.out.println("ERROR: not a valid choice");
                                break;
                        }
                    } catch(InputMismatchException e) {
                        System.out.println("ERROR: Invalid entry!");
                        input.nextLine();
                    }
                }
            }
        }
        for(NewspaperSubscriber temp : subs) {
            if(temp != null)
                System.out.println(temp.toString());
        }
    }
}