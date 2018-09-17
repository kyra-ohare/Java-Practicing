/*
 * Exercise 15, page 598.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts;

import java.util.Scanner;

public class CreateLoans {
    
    public static void main(String[] args) {
        int choice1;
        int choice2;
        int number;
        String lastName;
        double loanAmount;
        String term;
        Scanner input = new Scanner(System.in);
        Loan[] loans = new Loan[5];
        
        System.out.println("Welcome to " + LoanConstants.companyName + "\nBusiness Loan interest rate: " + LoanConstants.businessLoanInterestRate + " & Personal Loan interest rate: " + LoanConstants.personalLoanInterestRate);
        
        for(int i = 0; i < loans.length; ++i) {
            System.out.print("Which loan type: (1) Business or (2) Personal loan >>>> ");
                choice1 = input.nextInt();
                input.nextLine();
            System.out.print("Loan number >>>> ");
                number = input.nextInt();
                input.nextLine();
            System.out.print("Customer's Last Name >>>> ");
                lastName = input.nextLine();
            System.out.print("Loan Amount >>>> ");
                loanAmount = input.nextDouble();
                input.nextLine();
            System.out.print("(1) Short-term, (2) Medium-term or (3) Long-term >>>> ");
                choice2 = input.nextInt();
                input.nextLine();
                switch(choice2) {
                    case 1:
                        term = LoanConstants.shortTerm;
                        break;
                    case 2:
                        term = LoanConstants.mediumTerm;
                        break;
                    case 3:
                        term = LoanConstants.longTerm;
                        break;
                    default:
                        System.out.println("ERROR: Not a valid choice:");
                        term = LoanConstants.shortTerm;
                        break;
                }
            
            switch(choice1) {
                case 1: //Business Loan
                    loans[i] = new BusinessLoan(number, lastName, loanAmount, term);
                    break;
                case 2: //Personal Loan
                    loans[i] = new PersonalLoan(number, lastName, loanAmount, term);
                    break;
                default:
                    System.out.println("ERROR: Not a valid choice:");
                    break;
            }
        }
        for(Loan temp : loans) {
            System.out.println(temp.toString());
        }
    }
}