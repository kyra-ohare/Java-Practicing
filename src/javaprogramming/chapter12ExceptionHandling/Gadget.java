/*
 * Exercise 13, page 670.
 */
package javaprogramming.chapter12ExceptionHandling;

public class Gadget {
    private int itemNumber;
    private String description;
    private double price;
    
    public Gadget(int itemNumber, String description, double price) {
        this.itemNumber = itemNumber;
        this.description = description;
        this.price = price;
    }

    public int getItemNumber() {
        return itemNumber;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }
    
    public void display() {
        System.out.println("Item Number: " + getItemNumber() + " | Description: " + getDescription() + " | Price: " + getPrice());
    }
}