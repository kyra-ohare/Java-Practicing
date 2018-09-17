/*
 * Exercise 2, page 667.
 */
package javaprogramming.chapter12ExceptionHandling;

import java.util.Scanner;

public class TryToParseDouble {

    public static void main(String[] args) {
        String user;
        double num;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number >>>> ");
        try {
            user = input.nextLine();
            num = Double.parseDouble(user);

            System.out.printf("%.2f", num);
            System.out.println();
        } catch (NumberFormatException k) {
            System.out.println(k.getMessage());
            num = 0;
            System.out.println(num);
        }
    }
}