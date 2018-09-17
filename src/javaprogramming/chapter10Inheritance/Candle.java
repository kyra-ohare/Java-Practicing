/*
 * Exercise 2, page 539.
*/
package javaprogramming.chapter10Inheritance;

public class Candle {
    String color;
    int height;
    double price;

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.price = height * 2;
        this.height = height;
    }

    public double getPrice() {
        return price;
    }
}
