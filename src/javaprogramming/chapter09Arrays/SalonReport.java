/*
 * Exercise 7, page 493.
 */
package javaprogramming.chapter09Arrays;

public class SalonReport {
    String description;
    double price;
    int time;
    
    public SalonReport(String description, double price, int time) {
        this.description = description;
        this.price = price;
        this.time = time;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public int getTime() {
        return time;
    }
    
    public void display() {
        System.out.println(getDescription() + " | €" + getPrice() + " | " + getTime() + "min");
    }
}
