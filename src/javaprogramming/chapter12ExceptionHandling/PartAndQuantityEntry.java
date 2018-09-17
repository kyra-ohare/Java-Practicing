/*
 * Exercise 11, page 669.
 */
package javaprogramming.chapter12ExceptionHandling;

import java.util.Scanner;

public class PartAndQuantityEntry {
    
    public static void main(String[] args) {
        int partNumber;
        int quantity;
        String answer;
        Scanner input = new Scanner(System.in);
        
        do {
            try {
                System.out.print("Enter part number >>>> ");
                partNumber = input.nextInt();
                input.nextLine();
                System.out.print("Enter quantity >>>> ");
                quantity = input.nextInt();
                input.nextLine();
                int x = Integer.valueOf(partNumber);
                        
                if()
                    throw new DataException(DataMessages.message(0));
                else if())
                    throw new DataException(DataMessages.message(1));
                else if(partNumber < 0)
                    throw new DataException(DataMessages.message(2));
                else if(partNumber > 999)
                    throw new DataException(DataMessages.message(3));
                else if(quantity < 1)
                    throw new DataException(DataMessages.message(4));
                else if(quantity > 5_000)
                    throw new DataException(DataMessages.message(5));
                else
                    System.out.println("Valid entry.");


            } catch(DataException e) {
                System.out.println(e.getMessage());
            }
            System.out.print("Do you wish to continue (Y/N)? ");
            answer = input.nextLine().toUpperCase();
        } while(answer.charAt(0) == 'Y');
    }
}