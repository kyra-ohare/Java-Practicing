/*
 * Exercise 6, page 667.
 */
package javaprogramming.chapter12ExceptionHandling;

public class ThrowProductException {

    public static void main(String[] args) {
        //valid products
        try {
            Product p1 = new Product(451, 4.5);
        } catch (ProductException ex) {
            System.err.println(ex.getMessage() + "\n");
        }
        try {
            Product p2 = new Product(123, 1000);
        } catch (ProductException ex) {
            System.err.println(ex.getMessage() + "\n");
        }
        try {
            Product p3 = new Product(100, 0.01);
        } catch (ProductException ex) {
            System.err.println(ex.getMessage() + "\n");
        }

        //invalid product number (4 digits)
        try {
            Product p4 = new Product(1239, 23);
        } catch (ProductException ex) {
            System.err.println(ex.getMessage() + "\n");
        }

        //invalid price ($0)
        try {
            Product p5 = new Product(321, 0);
        } catch (ProductException ex) {
            System.err.println(ex.getMessage() + "\n");
        }

        //invalid product number and price
        try {
            Product p6 = new Product(2, 1234);
        } catch (ProductException ex) {
            System.err.println(ex.getMessage() + "\n");
        }

        System.out.println("End of program!");
    }
}