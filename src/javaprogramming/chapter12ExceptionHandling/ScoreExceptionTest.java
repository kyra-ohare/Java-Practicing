/*
 * Exercise 8, page 668.
 */
package javaprogramming.chapter12ExceptionHandling;

import java.util.Scanner;

public class ScoreExceptionTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int user;
        int[] ids = {201614, 257864, 357460, 321598, 456871};
        int[] scores = new int[5];

        System.out.println("Enter the scores for students below:");
        for (int i = 0; i < ids.length; ++i) {
            System.out.print(ids[i] + " >>>> ");
            user = input.nextInt();

            try {
                scores[i] = user;
                if (user >= 100) {
                    throw new ScoreException();
                }
            } catch (ScoreException e) {
                System.out.println(e.getMessage());
                scores[i] = 0;
            }
            input.nextLine();
        }
        System.out.println("\n**** REPORT ****");
        for (int i = 0; i < ids.length; ++i) {
            System.out.println("ID " + ids[i] + " scored: " + scores[i]);
        }
        if (input != null) {
            input.close();
        }
    }
}