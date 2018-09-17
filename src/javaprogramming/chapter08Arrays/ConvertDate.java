/*
 * Exercise 8, page 438;
 */
package javaprogramming.chapter08Arrays;

import java.util.Scanner;

public class ConvertDate {
    public static void main(String[] args) {
        int month = 0;
        int day = 0;
        int year = 0;
        int counter = 0;
        String[] splitter = new String[2];
        boolean isValidDate = false;
        Scanner input = new Scanner(System.in);
        String[] months = {"", "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December"};
        int[] days = {0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        
        System.out.print("Enter a date using slashes (dd/mm/yyyy) >>>> ");
        String date = input.nextLine();
        
        while(!isValidDate) {
            splitter = date.split("/");
            day = Integer.parseInt(splitter[0]);
            month = Integer.parseInt(splitter[1]);
            year = Integer.parseInt(splitter[2]);
            
            if(month == 2 && (day < 1 || day > days[2]+1)) {
                System.out.print("Enter a date in format (dd/mm/yyyy) >>>> ");
                date = input.nextLine();
                isValidDate = false;
            } 
            else if(month < 1 || month > 12 || day < 1 || day > days[month]) {
                System.out.print("Invalid Date. Enter a date in format (dd/mm/yyyy) >>>> ");
                date = input.nextLine();
                isValidDate = false;
            }
            else
                isValidDate = true;
        }
        
        System.out.println("The date is " + day + " " + months[month] + ", " + year);
        
        if((year % 400 == 0 || (year % 100 != 0 && year % 4 == 0)) && month >= 2) //is leap year?
            counter++;
        
        //counting the number of days in a year
        exit:
        for(int i = 1; i < months.length; ++i) { //days start with number 1
            for(int j = 1; j < (days[i]+1); ++j) { //because 1 number is lost (j doesn't initiate with 0), we need to give 1 number to array days.
                counter++;
                if(month == i && day == j) //when the right month and day is found
                    break exit; //program exits the loop.
            }
        }
        System.out.println("Date's ordinal position in the year " + counter);
    }
}