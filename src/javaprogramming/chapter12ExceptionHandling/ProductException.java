/*
 * Exercise 6, page 667.
 */
package javaprogramming.chapter12ExceptionHandling;

@SuppressWarnings("serial")
public class ProductException extends Exception {

    public ProductException(String description) {
        super(description);
    }
}