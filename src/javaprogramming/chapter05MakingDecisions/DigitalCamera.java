/*
 * Exercise 7, page 293.
 */
package javaprogramming.chapter05MakingDecisions;

public class DigitalCamera {
    String brand;
    int megapixel;
    int MAX_MEGAPIXELS = 10;
    int LIM_MEGAPIXELS = 6;
    double price;

    public DigitalCamera(String brand, int megapixels) {
        this.brand = brand;

        if(megapixels <= MAX_MEGAPIXELS){
                megapixel = megapixels;
        } else {
                megapixels = MAX_MEGAPIXELS;
        }

        if(megapixels <= LIM_MEGAPIXELS) {
                price = 99;
        } else {
                price = 129;
        }
    }
    public int getMegapixel() {
        return megapixel;
    }
    public double getPrice() {
        return price;
    }
    public void display() {
        System.out.println("Welcome to Shutterbug's Camera Store\nBrand: " + brand +
                        "\nMegapixels: " + megapixel + 
                        "\nPrice: " + price);
        System.out.println();
    }
}