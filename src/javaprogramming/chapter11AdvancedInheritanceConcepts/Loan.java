/*
 * Exercise 15, page 598.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts;

public abstract class Loan implements LoanConstants {
    int number;
    String lastName;
    double loanAmount;
    double interestRate;
    String term;
    
    public Loan(int number, String lastName, double loanAmount, String term) {
        this.number = number;
        this.lastName = lastName;

        if(loanAmount > LoanConstants.maxLoan)
            this.loanAmount = LoanConstants.maxLoan;
        else
            this.loanAmount = loanAmount;
        
        if(term == LoanConstants.shortTerm || term == LoanConstants.mediumTerm || term == LoanConstants.longTerm)
            this.term = term;
        else
            this.term = LoanConstants.shortTerm;
    }
    
    @Override
    public String toString() {
        return "\nLoan number: " + number + " | Customer last name: " + lastName + " | Loan Amount: " + loanAmount + " | Interest Rate: " + interestRate + " | Term: " + term;
    }
}