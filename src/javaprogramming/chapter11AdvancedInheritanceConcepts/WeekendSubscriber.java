/*
 * Exercise 6, page 596.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts;

public class WeekendSubscriber extends NewspaperSubscriber {
    
    public WeekendSubscriber() {
        setRate(2.00);
    }
    
    @Override
    public void setRate(double rate) {
        super.rate = rate;
    }
    
    @Override
    public String toString() {
        return "\nWeekend Subscriber\nStreet Address: " + getAddress() + " | Rate: " + getRate();
    }
}