package javaprogramming.chapter12ExceptionHandling;

/*
 * Exercise 3, page 667.
 */
import java.util.InputMismatchException;
import java.util.Scanner;

public class MeanMedianhandleException {

    static int indeces = 5;

    public static void main(String[] args) {
        int[] array = new int[indeces];
        Scanner input = new Scanner(System.in);

        for (int i = 0; i < indeces; i++) {
            try {
                System.out.print("Enter an int >>> ");
                array[i] = input.nextInt();
            } catch (InputMismatchException ex) {
                System.err.println("That's not an integer.\n");
                array[i] = 0;
                input.nextLine();
            }
        }

        System.out.print("You endered: ");
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
        mean(array);
        median(array);

        if (input != null) {
            input.close();
        }
    }

    public static void mean(int[] array) {
        double mean;
        double total = 0;
        for(int temp : array) {
            total += temp;
        }
        mean = total / indeces;
        System.out.println("Mean: " + mean);
    }

    public static void median(int[] array) {
        int median = 0;
        int index = indeces / 2;
        index = Math.round(index);
        for (int i = 0; i < array.length; i++) {
            median = array[index];
        }
        System.out.println("Median: " + median);
    }
}