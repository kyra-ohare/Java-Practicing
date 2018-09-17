/*
 * Exercise 6, page 437
 */
package javaprogramming.chapter08Arrays;

public class Salesperson {
    private int ID;
    private double salesAmount;

    public Salesperson(int ID, double salesAmount) {
        this.ID = ID;
        this.salesAmount = salesAmount;
    }
    
    public Salesperson(int ID) {
        this.ID = ID;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public double getSalesAmount() {
        return salesAmount;
    }

    public void setSalesAmount(double salesAmount) {
        this.salesAmount = salesAmount;
    }

    public void display() {
        System.out.print("ID: " + ID + " ");
        System.out.print("Sales: " + salesAmount + "\n");
    }
}
