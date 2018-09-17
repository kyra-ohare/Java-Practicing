/*
 * Exercise 2, page 595.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts;

public abstract class PhoneCall {
    String phoneNumber;
    double price;

    public PhoneCall(String phoneNumber) {
            this.phoneNumber = phoneNumber;
            price = 0;
    }

    public void setPrice(double price) {
            this.price = price;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public abstract double getPrice();

    public abstract void displayCallInfo();
}
