/*
 * Exercise 1, page 667.
 */
package javaprogramming.chapter12ExceptionHandling;

import javax.swing.*;

public class BadSubscriptCaught {

    public static void main(String[] args) {
        int index;
        String[] names = {"Alice", "Bob", "Charlie", "David", "Emmanuel", "Fabi", "Gabriel", "Hebert", "Ivan", "Jane", "Kleyton", "Leonard", "Mary", "Nancy", "Octavio", "Paul", "Robby", "Sam", "Taylor", "Victoria", "Walter"};
        String input = JOptionPane.showInputDialog(null, "Enter a number");
        
        try {
            index = Integer.parseInt(input);
            JOptionPane.showMessageDialog(null, names[index-1]);
        } catch(ArrayIndexOutOfBoundsException | NumberFormatException error) {
            JOptionPane.showMessageDialog(null, "Invalid number");
        } finally {
            JOptionPane.showMessageDialog(null, "Thank you");
        }
    }
}