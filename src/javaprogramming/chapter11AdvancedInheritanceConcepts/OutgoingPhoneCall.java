/*
 * Exercise 2, page 595.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts;

public class OutgoingPhoneCall extends PhoneCall {
    int timeOfCallInMinutes;
    
    public OutgoingPhoneCall(String phoneNumber, int minutes) {
        super(phoneNumber);
        super.price = 0.04;
        timeOfCallInMinutes = minutes;
    }

    @Override
    public double getPrice() {
        return super.price * timeOfCallInMinutes;
    }

    @Override
    public void displayCallInfo() {
        System.out.println("Outgoing Phone Call\nPhone number: " + getPhoneNumber() + " rate per minute: " + price + " price of the call: " + getPrice() + "\n");
    }
    
}