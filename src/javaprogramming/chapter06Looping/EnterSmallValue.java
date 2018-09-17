/*
 * Validating Data is the process of ensuring that a value falls within a specified range. Page 309.
 */
package javaprogramming.chapter06Looping;

import java.util.Scanner;

public class EnterSmallValue {
    public static void main(String[] args) {
        int userEntry;
        final int LIMIT = 3;
        String message = "Please enter an integer no higher than " + LIMIT + " >>>> ";
        Scanner input = new Scanner(System.in);

        System.out.print(message);
        userEntry = input.nextInt();

        while(userEntry > LIMIT) {
                System.out.println("The number you entered was too high.");
                System.out.println(message);
                userEntry = input.nextInt();
        }

        System.out.println("You correctly entered " + userEntry);
        
        if(input != null)
            input.close();
    }
}