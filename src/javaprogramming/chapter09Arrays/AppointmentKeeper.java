/*
 *Exercie 10, page 494.
*/
package javaprogramming.chapter09Arrays;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AppointmentKeeper {
    public static void main(String[] args) {
        String[][] appointments = new String[31][24];
        final int QUIT = 99;
        int day = 0;
        int time = 0;
        String description;
        String answer;
        Scanner input = new Scanner(System.in);
        
        for(int i = 0; i < appointments.length; ++i) {
            for(int j = 0; j < appointments[i].length; ++j) {
                Arrays.fill(appointments[j], "Nothing scheduled");
            }
        }

        System.out.print("Enter a day to see what is scheduled >> ");
        try {
            day = input.nextInt();
            input.nextLine();
        } catch(InputMismatchException e) {
            System.err.println("Try again!");
        }
        while(day != QUIT) {
            System.out.print("Enter a time >> ");
            try {    
                time = input.nextInt();
                input.nextLine();
            } catch(InputMismatchException e) {
                System.err.println("Try again!");
            }
            try {
                for(int i = 0; i < appointments.length; ++i) {
                    for(int j = 0; j < appointments[i].length; ++j) {
                        if(i == day && j == time) {
                            System.out.printf("%2d:00 >> " + appointments[day][j], j);
                            System.out.print("\nWish to add/change appointment(Y/N) >> ");
                            answer = input.nextLine();
                            if(answer.charAt(0) == 'Y' || answer.charAt(0) == 'y') {
                                System.out.print("Description >> ");
                                description = input.nextLine();
                                appointments[day][time] = description;
                            }
                        }
                    }
                }
                System.out.println("All your appointments for day " + day + ".");
                for(int i = 0; i < appointments.length; ++i) {
                    for(int j = 0; j < appointments[i].length; ++j) {
                        if(i == day) {
                            System.out.printf("%2d:00 >> " + appointments[day][j] + "\n", j);
                        }
                    }
                }
            } catch(ArrayIndexOutOfBoundsException e) {
                System.err.println("Inexistent day. Try again!");
            }
            
            System.out.print("\nEnter a day to see what is scheduled, or 99 to quit >> ");
            try {
                day = input.nextInt();
                input.nextLine();
            } catch(InputMismatchException e) {
                System.err.println("Try again!");
            }
        }
        System.out.println("Bye");
    }
}
