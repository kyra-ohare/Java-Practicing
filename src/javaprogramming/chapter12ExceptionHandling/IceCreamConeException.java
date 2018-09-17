/*
 * Exercise 7, page 668.
 */
package javaprogramming.chapter12ExceptionHandling;

@SuppressWarnings("serial")
public class IceCreamConeException extends Exception {

    public IceCreamConeException(String description) {
        super(description);
    }
}