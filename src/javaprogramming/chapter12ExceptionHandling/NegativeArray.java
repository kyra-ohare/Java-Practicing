/*
 * Exercise 4, page 667.
 */
package javaprogramming.chapter12ExceptionHandling;

import java.util.Scanner;

public class NegativeArray {

    public static void main(String[] args) {
        String answer;
        int[] array;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number to create an array >>>> ");
        answer = input.next();

        try {
            array = new int[Integer.parseInt(answer)];
            System.out.println("Success!");
        } catch (NegativeArraySizeException ex) { //negative numbers.
            System.out.println("Negative number.");
            System.out.println(ex.getMessage());
        } catch (NumberFormatException ex) { //nonnumeric or negative numbers
            System.out.println("It's not a number.");
            System.out.println(ex.getMessage());
        } finally {
            System.out.println("Thank you!");
            input.close();
        }
    }
}