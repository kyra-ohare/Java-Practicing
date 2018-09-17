/*
 * Exercise 13, page 390.
 */
package javaprogramming.chapter07;

public class TaxReturn {
    StringBuilder SSN;
    String lastName;
    String firstName;
    String streetAddress;
    String city;
    String state;
    StringBuilder zipCode;
    double annualIncome;
    char maritalStatus;
    double taxLiability;
    
    public TaxReturn(StringBuilder SSN, String lastName, String firstName, String streetAddress, String city, String state, StringBuilder zipCode, double annualIncome, char maritalStatus) {
        this.SSN = SSN;
        this.lastName = lastName.toUpperCase();
        this.firstName = firstName.toUpperCase();
        this.streetAddress = streetAddress;
        this.city = city;
        this.state = state;
        this.zipCode = zipCode;
        this.annualIncome = annualIncome;
        this.maritalStatus = Character.toUpperCase(maritalStatus);
        
        if(annualIncome > 0 && annualIncome < 20_000) {
            if(this.maritalStatus == 'S')
                this.taxLiability = 0.15;
            else if(this.maritalStatus == 'M')
                this.taxLiability = 0.14;
            else
                this.taxLiability = 0;
        }
        else if(annualIncome > 20_001 && annualIncome < 50_000) {
            if(this.maritalStatus == 'S')
                this.taxLiability = 0.22;
            else if(this.maritalStatus == 'M')
                this.taxLiability = 0.20;
            else
                this.taxLiability = 0;
        } 
        else if(annualIncome > 50_001) {
            if(this.maritalStatus == 'S')
                this.taxLiability = 0.30;
            else if(this.maritalStatus == 'M')
                this.taxLiability = 0.28;
            else
                this.taxLiability = 0;
        }
        displayTaxReturnData();
    }
    
    public void displayTaxReturnData() {
        System.out.println("\nSocial Security Number: " + SSN + 
                            "\nName: " + lastName + ", " + firstName +
                            "\nStreet Address: " + streetAddress +
                            ", " + city + " - " + state + ", " + zipCode +
                            "\nAnnual Income: " + annualIncome +
                            "\nMarital Status: " + maritalStatus +
                            " ----> Tax Liability: " + taxLiability);
    }
}