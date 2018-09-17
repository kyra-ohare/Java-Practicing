/*
 * Exercise 6, page 596.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts;

public class SevenDaySubscriber extends NewspaperSubscriber {
    
    public SevenDaySubscriber() {
        setRate(4.50);
    }
    @Override
    public void setRate(double rate) {
        super.rate = rate;
    }
    
    @Override
    public String toString() {
        return "\n7-Day Subscriber\nStreet Address: " + getAddress() + " | Rate: " + getRate();
    }
}