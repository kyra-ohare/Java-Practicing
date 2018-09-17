/*
 * Exercise 5, page 667.
 */
package javaprogramming.chapter12ExceptionHandling;

import java.util.Scanner;

public class SqrtException {

    public static void main(String[] args) {
        int num;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an int >>>> ");
        num = input.nextInt();

        try {
            System.out.println("Square root of " + num + " is " + Math.sqrt(num));
        } catch (ArithmeticException ex) {
            System.out.println("ArithmeticException");
            System.out.println(ex.getMessage());
        } finally {
            input.close();
        }
    }
}