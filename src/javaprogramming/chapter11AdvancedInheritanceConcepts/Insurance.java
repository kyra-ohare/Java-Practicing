/*
 * Exercise 9, page 597.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts;

public abstract class Insurance {
    String insuranceType;
    double monthlyPrice;
    
    public Insurance(String insuranceType) {
        this.insuranceType = insuranceType;
    }
    
    public String getInsuranceType() {
        return insuranceType;
    }
    
    public double getMonthlyPrice() {
        return monthlyPrice;
    }
    
    public abstract void setCost();
    
    public abstract void display();
}