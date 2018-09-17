/*
 * Exercise 1, page 492.
 */
package javaprogramming.chapter09Arrays;

import java.util.*;

public class SortStrings {
    public static void main(String[] args) {
        String[] message = new String[10];

        message[0] = "Minha";
        message[1] = "mae";
        message[2] = "e";
        message[3] = "uma";
        message[4] = "heroina.";
        message[5] = "Eu";
        message[6] = "irei";
        message[7] = "sempre";
        message[8] = "admirar";
        message[9] = "ela.";

        System.out.println("Before sorting...");
        for (String message1 : message) {
            System.out.print(message1 + " ");
        }

        Arrays.sort(message, String.CASE_INSENSITIVE_ORDER);

        System.out.println("\nAfter sorting...");
        for (String message1 : message) {
            System.out.print(message1 + " ");
        }
    }
}