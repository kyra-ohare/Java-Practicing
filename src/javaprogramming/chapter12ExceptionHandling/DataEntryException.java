/*
 * Exercise 10, page 668.
 */
package javaprogramming.chapter12ExceptionHandling;

public class DataEntryException extends Exception {
    
    public DataEntryException() {
        super("Invalid Integer Data.");
    }
}
