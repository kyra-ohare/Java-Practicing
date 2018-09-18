/*
 * Exercise 13, page 670.
 */
package javaprogramming.chapter12ExceptionHandling;

import java.util.Arrays;

public class Order {
    private int orderNumber;
    private String customerName;
    private String address;
    private Gadget[] list;
    private double totalPrice;
    private double shippingHandlingFee;
    
    public Order(int orderNumber, String customerName, String address, Gadget[] list, double totalPrice, double shippingHandlingFee) {
        this.orderNumber = orderNumber;
        this.customerName = customerName;
        this.address = address;
        this.list = list;
        this.totalPrice = totalPrice;
        this.shippingHandlingFee = shippingHandlingFee;
    }

    public int getOrderNumber() {
        return orderNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public String getAddress() {
        return address;
    }

    public Gadget[] getList() {
        
        return list;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public double getShippingHandlingFee() {
        return shippingHandlingFee;
    }
    
    public void display() {
        System.out.println("\nOrder Number: " + getOrderNumber() + " | Name: " + getCustomerName() + " | Address: " + getAddress() + "\n  Your Gadgets:\n");
        for(Gadget temp : getList()) {
            if(temp != null)
                temp.display();
        }
        System.out.println("\nTotal Price: " + getTotalPrice() + " | Shipping & Handling Fee: " + getShippingHandlingFee());
    }
}