/*
 * Exercise 6, page 493.
 */
package javaprogramming.chapter09Arrays;

import java.util.Scanner;

public class Schedule {
    public static void main(String[] args) {
        String courses[][] = {{"Web Design", "Networking", "Database", "Programming"},
                              {"Thu 3:30", "Mon 9:00", "Sat 7:30", "Fri 5:00"}};
        int counter = 0;
        String subString = null;
        Scanner input = new Scanner(System.in);
        String answer;

        do {
            System.out.print("Enter a course name >>>> ");
            answer = input.nextLine();
            answer = Character.toUpperCase(answer.charAt(0)) + answer.substring(1);
            
            exit:
            for(int i = 0; i < courses.length; ++i) {
                for(int j = 0; j < courses[i].length; ++j) {
                    if(courses[i][j].startsWith(answer)) {
                        System.out.println("Schedule: " + courses[i+1][j]);
                        break exit;
                    } else {
                        ++counter;
                        if(courses[i].length == counter) {
                            System.out.println("No course found.");
                            break exit;
                        }
                    }
                }
            }
            System.out.print("Search for more courses (Y/N)? ");
            answer = input.nextLine();
        } while(answer.charAt(0) == 'y' || answer.charAt(0) == 'Y');
        System.out.println("Bye");
    }
}