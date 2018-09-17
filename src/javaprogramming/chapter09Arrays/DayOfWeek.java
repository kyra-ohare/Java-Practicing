/*
 *Exercie 8, page 494.
*/
package javaprogramming.chapter09Arrays;

import java.util.Scanner;

public class DayOfWeek {
    enum Days {SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY};
    
    public static void main(String[] args) {
        String answer;
        Scanner input = new Scanner(System.in);
        Days day = null;
        
        for(Days d : Days.values())
            System.out.print(d + " | ");
        
        do {
            System.out.print("\nType a day >>>> ");
            answer = input.nextLine().toUpperCase();
            try {
                day = Days.valueOf(answer);
                switch(day) {
                    case SUNDAY:
                        System.out.println("Opening Hours: 11am to 5pm");
                        break;
                    case MONDAY:
                    case TUESDAY:
                    case WEDNESDAY:
                    case THURSDAY:
                    case FRIDAY:
                        System.out.println("Opening Hours: 9am to 9pm");
                        break;
                    case SATURDAY:
                        System.out.println("Opening Hours: 10am to 6pm");
                        break;
                }
            } catch(IllegalArgumentException e) {
                System.err.println("Sorry, try again!");
            }
            System.out.print("\nDo you wish to continue (Y/N)? ");
            answer = input.nextLine();
        } while(answer.charAt(0) == 'y' || answer.charAt(0) == 'Y');
        System.out.println("Bye");
    }
}
