/*
 * Exercise 6, page 540.
*/
package javaprogramming.chapter10Inheritance;

public class Package {
    int weight;
    char shippingMethod;
    double shippingCost;
    
    public Package(int weight, char shippingMehod) {
        this.weight = weight;
        this.shippingMethod = shippingMehod;
        calculateCost(weight, shippingMehod);
    }

    protected double calculateCost(int weight, char shippingMehod) {
        if(weight >= 1 && weight <= 8) {
            switch (shippingMehod) {
                case 'A':
                case 'a':
                    shippingCost = 2;
                    break;
                case 'T':
                case 't':
                    shippingCost = 1.5;
                    break;
                case 'M':
                case 'm':
                    shippingCost = 0.50;
                    break;
                default:
                     shippingCost = 0;
                    break;
            }
        } else
            if(weight >= 9 && weight <= 16) {
                switch (shippingMehod) {
                case 'A':
                case 'a':
                    shippingCost = 3;
                    break;
                case 'T':
                case 't':
                    shippingCost = 2.35;
                    break;
                case 'M':
                case 'm':
                    shippingCost = 1.50;
                    break;
                default:
                    shippingCost = 0;
                    break;
            }
                
        } else {
                switch (shippingMehod) {
                case 'A':
                case 'a':
                    shippingCost = 4.5;
                    break;
                case 'T':
                case 't':
                    shippingCost = 3.25;
                    break;
                case 'M':
                case 'm':
                    shippingCost = 2.15;
                    break;
                default:
                    shippingCost = 0;
                    break;
            }
        }
        return shippingCost;
    }

    public int getWeight() {
        return weight;
    }

    public char getShippingMethod() {
        return shippingMethod;
    }

    public double getShippingCost() {
        return shippingCost;
    }
    
    public void display() {
        System.out.println("Weight (oz.): " + getWeight() + "\nShipping Method: " + getShippingMethod() + "\nShipping Cost: " + getShippingCost());
    }
}