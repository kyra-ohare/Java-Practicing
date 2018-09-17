/*
 * Exercise 9, page 597.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts;

import java.util.Scanner;

public class InsuranceTest {
    
    public static void main(String[] args) {
        String answer;
        Scanner input = new Scanner(System.in);
        Life f;
        Health h;
        
        do {
            System.out.print("Which insurance would you like? ");
            answer = input.nextLine();
            
            if(answer.toLowerCase().contains("life")) {
                f = new Life();
                f.setCost();
                f.display();
            } else if(answer.toLowerCase().contains("health")) {
                h = new Health();
                h.setCost();
                h.display();
            } else
                System.out.println("Insurance not found. Try again!");
            System.out.println();
                
            System.out.print("Would you like to continue (Y/N)? ");
            answer = input.nextLine();
        } while(answer.toUpperCase().charAt(0) == 'Y');
        System.out.println("Bye");
    }
}