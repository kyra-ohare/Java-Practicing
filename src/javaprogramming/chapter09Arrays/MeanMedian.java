/*
 * Exercise 2, page 492.
 */
package javaprogramming.chapter09Arrays;
import java.util.Scanner;

public class MeanMedian {
    static int indeces = 8;
    public static void main(String[] args) {
        int[] array = new int[indeces];
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < indeces; i ++) {
            System.out.print("Enter an int >>> ");
            array[i] = input.nextInt();
        }

        System.out.print("You endered: ");
        for(int i = 0; i < array.length; i ++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        mean(array);
        median(array);

        if(input != null)
            input.close();
    }

    public static void mean(int[] array) {
        double mean;
        double total = 0;
        for(int i = 0; i < array.length; i ++) {
                total += array[i]; 
        }
        mean = total / indeces;
        System.out.println("Mean: " + mean);
    }

    public static void median(int[] array) {
        int median = 0;
        int index = indeces / 2;
        index = Math.round(index);
        for(int i = 0; i < array.length; i ++) {
            median = array[index];
        }
        System.out.println("Median: " + median);
    }
}