/*
 * Exercise 2, page 595.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts;

public class IncomingPhoneCall extends PhoneCall {
    
    public IncomingPhoneCall(String phoneNumber) {
            super(phoneNumber);
            super.price = 0.02;
    }

    @Override
    public double getPrice() {
            return super.price;
    }

    @Override
    public void displayCallInfo() {
        System.out.println("Incoming Phone Call\nPhone number: " + getPhoneNumber() + " rate: " + getPrice() + " price of the call: " + getPrice() + "\n");
    }

}
