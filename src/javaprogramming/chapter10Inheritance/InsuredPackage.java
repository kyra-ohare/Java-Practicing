/*
 * Exercise 6, page 540.
*/
package javaprogramming.chapter10Inheritance;

public class InsuredPackage extends Package {
    
    public InsuredPackage(int weight, char shippingMehod) {
        super(weight, shippingMehod);
        calculateInsuredCost(weight, shippingMehod);
    }
    
    public double calculateInsuredCost(int weight, char shippingMehod) {
        double regCost = super.calculateCost(weight, shippingMehod);
        
        if(regCost >= 0 && regCost <= 1)
            shippingCost = regCost + 2.45;
        else if(regCost >= 1.01 && regCost <= 3)
            shippingCost = regCost + 3.95;
        else
            shippingCost = regCost + 5.55;

        return shippingCost;
    }
}