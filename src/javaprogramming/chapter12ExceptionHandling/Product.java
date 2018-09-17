/*
 * Exercise 6, page 667.
 */
package javaprogramming.chapter12ExceptionHandling;

public class Product {
    int productNum;
    double price;
    final int LIMIT_DIGITS = 3;
    final double MIN_PRICE = 0.01;
    final double MAX_PRICE = 1_000;

    public Product(int n, double p) throws ProductException {
        if ((String.valueOf(n).length() < LIMIT_DIGITS) || (String.valueOf(n).length() > LIMIT_DIGITS)) {
            throw (new ProductException("Product number " + n + " must have " + LIMIT_DIGITS + " digits"));
        }

        if ((p < MIN_PRICE) || (p > MAX_PRICE)) {
            throw (new ProductException("Price of " + p + " is either less than $" + MIN_PRICE + " or greater than " + MAX_PRICE));
        }

        productNum = n;
        price = p;
        System.out.println("Product number: " + productNum + ", price: " + price + " successfully created.");
    }
}