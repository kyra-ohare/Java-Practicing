/*
 * Exercise 6, page 596.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts;

public abstract class NewspaperSubscriber {
    String address;
    double rate;

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public double getRate() {
        return rate;
    }

    public abstract void setRate(double rate);
    
    public boolean equals(String address) {
        return this.address.equalsIgnoreCase(address) ? true : false;
    }
}