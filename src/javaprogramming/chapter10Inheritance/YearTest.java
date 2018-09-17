/*
 * Exercise 4, page 539.
*/
package javaprogramming.chapter10Inheritance;

import java.util.Scanner;

public class YearTest {
    public static void main(String[] args) {
        String answer = null;
        int choice = 0;
        int result = 0;
        int[] date = new int[2];
        String[] splitter = new String[2];
        Scanner input = new Scanner(System.in);
        
        Year year = new Year();
        Year leapYear = new LeapYear();
        
        System.out.println("Year: " + year.getDays_in_a_year());
        System.out.println("LeapYear: " + leapYear.getDays_in_a_year());
        
        System.out.print("(1) Year or (2) LeapYear >>>> ");
            answer = input.nextLine();
            choice = Integer.parseInt(answer);
        System.out.print("Day & Month (dd/mm) >>>> ");
            answer = input.nextLine();
        splitter = answer.split("/");
            date[0] = Integer.parseInt(splitter[0]);
            date[1] = Integer.parseInt(splitter[1]);


        switch(choice) {
            case 1: //year
                result = year.daysElapsed(date[0], date[1]);
                System.out.println("Number of days elapsed since 1st Januray: " + result);
                break;
            case 2: //leapYear
                result = leapYear.daysElapsed(date[0], date[1]);
                System.out.println("Number of days elapsed since 1st Januray: " + result);
                break;
            default:
                System.out.println("Not a valid choice");
        }
    }
}
