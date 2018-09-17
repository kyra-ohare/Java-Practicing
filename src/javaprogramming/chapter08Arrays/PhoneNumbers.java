/*
 * Excercise 11, page 438.
 */
package javaprogramming.chapter08Arrays;

import java.util.Scanner;

public class PhoneNumbers {

    public static void main(String[] args) {
        final int MAX_ENTRIES = 12;
        String entry;
        String[] names = new String[MAX_ENTRIES];
            names[0] = "Adrian";
            names[1] = "Paul";
            names[2] = "Peter";
            names[3] = "Joey";
            names[4] = "Carl";
            names[5] = "Ivan";
            names[6] = "Jack";
            names[7] = "David";
            names[8] = "Jason";
            names[9] = "Stephen";
        String[] numbers = new String[MAX_ENTRIES];
            numbers[0] = "422-0920";
            numbers[1] = "847-9520";
            numbers[2] = "432-2590";
            numbers[3] = "421-7856";
            numbers[4] = "345-2049";
            numbers[5] = "653-7540";
            numbers[6] = "159-3574";
            numbers[7] = "654-4523";
            numbers[8] = "327-6325";
            numbers[9] = "424-6570";
            
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a name >>>> ");
        entry = input.nextLine();
            
        do {
            for(int i = 0; i < names.length; ++i) {
                if(names[i] != null) {
                    if(entry.equalsIgnoreCase(names[i])) {
                        System.out.println("Phone number: " + numbers[i]);
                        break;
                    }
                } else {
                    names[i] = entry;
                    System.out.print("Enter a phone number for " + names[i] + " >>>> ");
                    entry = input.nextLine();
                    numbers[i] = entry;
                    break;
                }
            }
            if(names[MAX_ENTRIES-1] != null) {
                System.out.println("    Phone Directory is FULL");
            }
            System.out.print("Enter a name or \"quit\" to exit >>>> ");
            entry = input.nextLine();
        } while(!entry.equalsIgnoreCase("quit"));
    }
}