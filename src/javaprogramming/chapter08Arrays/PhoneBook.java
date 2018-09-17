/*
 * Exercise 9, page 438;
 */
package javaprogramming.chapter08Arrays;

import java.util.Scanner;

public class PhoneBook {
    public static void main(String[] args) {
        final int MAX_ENTRY = 20;
        String[] names = new String[MAX_ENTRY];
        String[] phoneNumbers = new String[MAX_ENTRY];
        String endProgram = "zzz";
        String entry;
        Scanner input = new Scanner(System.in);
        
        for(int i = 0; i < MAX_ENTRY; ++i) {
            System.out.print((i+1) + ". Name or \"zzz\" to end >>>> ");
                entry = input.nextLine();
            if(entry.equals(endProgram))
                break;
                names[i] = entry;
            System.out.print((i+1) + ". Number >>>> ");
                entry = input.nextLine();
                phoneNumbers[i] = entry;
            System.out.println();
        }
        
        for(int i = 0; i < MAX_ENTRY; ++i) {
            if(names[i] != null)
                System.out.println(names[i]);
        }
        
        do {
            System.out.print("Enter a name or \"zzz\" to end >>>> ");
            entry = input.nextLine();
            for(int i =0; i < MAX_ENTRY; ++i) {
                if(entry.equals(names[i]))
                    System.out.println("Phone number: " + phoneNumbers[i]);
            }
        } while(!entry.equals(endProgram));
    }
}