/*
 * Exercise 6, page 596.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts;

public class WeekdaySubscriber extends NewspaperSubscriber {

    public WeekdaySubscriber() {
        setRate(3.50);
    }
    
    @Override
    public void setRate(double rate) {
        super.rate = rate;
    }
    
    @Override
    public String toString() {
        return "\nWeekday Subscriber\nStreet Address: " + getAddress() + " | Rate: " + getRate();
    }
}