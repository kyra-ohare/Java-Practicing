/*
 * Exercise 11, page 669.
 */
package javaprogramming.chapter12ExceptionHandling;

public class DataMessages {
    public static String message(int index) {
        String message = null;
        String[] messages = new String[6];
        messages[0] = "The part number is not numeric.";
        messages[1] = "The quantity is not numeric.";
        messages[2] = "The part number is too low (less than 0).";
        messages[3] = "The part number is too high (more than 999).";
        messages[4] = "The quantity ordered is too low (less than 1).";
        messages[5] = "The quantity ordered is too high (more than 5,000).";
        
        for(int i = 0; i < messages.length; ++i) {
            if(i == index)
                message = messages[index];
        }
        
        return message;
    }
}