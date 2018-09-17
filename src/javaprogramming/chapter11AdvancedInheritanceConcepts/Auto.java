/*
 * Exercise 3, page 595.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts;

public abstract class Auto {
    String make;
    double price;

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public double getPrice() {
        return price;
    }

    public abstract void setPrice();
}