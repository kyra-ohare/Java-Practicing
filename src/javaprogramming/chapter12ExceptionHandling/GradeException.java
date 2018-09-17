/*
 * Exercise 9, page 668.
 */
package javaprogramming.chapter12ExceptionHandling;

@SuppressWarnings("serial")
public class GradeException extends Exception {

    public GradeException() {
        super("Invalid grade.");
    }

    public static char[] grades = {'A', 'B', 'C', 'D', 'F', 'I'};
}