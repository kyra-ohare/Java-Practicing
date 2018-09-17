/*
 * Exercise 9, page 597.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts;

public class Health extends Insurance {

    public Health() {
        super("Health Insurance");
    }

    @Override
    public void setCost() {
        monthlyPrice = 196;
    }

    @Override
    public void display() {
        System.out.println(getInsuranceType() + " >>>> Monthly Fee: " + getMonthlyPrice());
    }
}