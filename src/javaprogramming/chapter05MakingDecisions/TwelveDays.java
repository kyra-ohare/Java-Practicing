/*
 * Exercise 10, page 294.
 */
package javaprogramming.chapter05MakingDecisions;

import java.util.Scanner;

public class TwelveDays {
    public static void main(String[] args) {
        int dayI;
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a day (an integer) >> ");
        dayI = input.nextInt();

        switch(dayI) {
        case 5:
                System.out.println("Five gold rings");
        case 4:
                System.out.println("Four colly birds");
        case 3:
                System.out.println("Three French hens");
        case 2:
                System.out.println("Two turtle doves");
        case 1:
                System.out.println("A partridge in a pear tree");
        }

        input.close();
    }
}
