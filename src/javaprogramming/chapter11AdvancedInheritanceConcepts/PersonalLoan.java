/*
 * Exercise 15, page 598.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts;

public class PersonalLoan extends Loan {
    
    public PersonalLoan(int number, String lastName, double loanAmount, String term) {
        super(number, lastName, loanAmount, term);
        interestRate = LoanConstants.personalLoanInterestRate;
    }
}