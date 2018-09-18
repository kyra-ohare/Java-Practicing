/*
 * Exercise 11, page 669.
 */
package javaprogramming.chapter12ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class PartAndQuantityEntry {
    
    public static void main(String[] args) {
        String partNumberAnswer;
        String quantityAnswer;
        int partNumber;
        int quantity;
        String answer;
        Scanner input = new Scanner(System.in);
        
        do {
            try {
                System.out.print("Enter part number >>>> ");
                    partNumberAnswer = input.nextLine();
                    partNumber = Integer.parseInt(partNumberAnswer);
                System.out.print("Enter quantity >>>> ");
                   quantityAnswer = input.nextLine();
                   quantity = Integer.parseInt(quantityAnswer);
                
                if(!Character.isDigit(partNumber))
                    throw new DataException(DataMessages.message(0));
                else if(quantity != (int)quantity)
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


            } catch(InputMismatchException | DataException e) {
                System.out.println(e.getMessage());
            } finally {
                System.out.print("Do you wish to continue (Y/N)? ");
                answer = input.nextLine().toUpperCase();
            }
        } while(answer.charAt(0) == 'Y');
    }
}