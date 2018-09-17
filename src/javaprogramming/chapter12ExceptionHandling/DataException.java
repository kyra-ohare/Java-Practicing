/*
 * Exercise 11, page 669.
 */
package javaprogramming.chapter12ExceptionHandling;

public class DataException extends Exception {
    public DataException(String error) {
        super(error);
    }
}