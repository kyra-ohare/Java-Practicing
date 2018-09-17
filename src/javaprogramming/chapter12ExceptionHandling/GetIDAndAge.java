/*
 * Exercise 10, page 668.
 */
package javaprogramming.chapter12ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GetIDAndAge {
    public static void main(String[] args) {
        int id = 0, age = 0;
        Scanner input = new Scanner(System.in);
        
        do {
            try {
                System.out.print("Enter ID >>>> ");
                id = input.nextInt();
                input.nextLine();
                System.out.print("Enter Age >>>> ");
                age = input.nextInt();
                input.nextLine();

                if((id < 0 || id > 999) || (age < 0 || age > 119)) {
                    throw new DataEntryException();
                } else
                    System.out.println("Valid data.");
                
            } catch(DataEntryException | InputMismatchException e) {
                System.out.println(e.getMessage());
            }
        } while(id != 0 && age != 0);
        System.out.println("Bye");
    }
}