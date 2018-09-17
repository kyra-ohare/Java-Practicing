/*
 * Exercise 8, page 668.
 */
package javaprogramming.chapter12ExceptionHandling;

@SuppressWarnings("serial")
public class ScoreException extends Exception {

    public ScoreException() {
        super("Invalid score.");
    }
}