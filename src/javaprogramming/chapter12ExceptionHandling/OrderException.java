/*
 * Exercise 13, page 670.
 */
package javaprogramming.chapter12ExceptionHandling;

public class OrderException extends Exception{
    
    public OrderException(String error) {
        super(error);
    }
}