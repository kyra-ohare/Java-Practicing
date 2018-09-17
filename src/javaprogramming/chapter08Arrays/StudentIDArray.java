/*
 * Exercise 10, page 438;
 */
package javaprogramming.chapter08Arrays;

import javax.swing.JOptionPane;

public class StudentIDArray {

    public static void main(String[] args) {
        String input;
        int temp;
        String[] ids = {"1001", "1002", "1003", "1004", "1005", "1006", "1007", "1008", "1009", "1010"};
        String[] names = {"John", "Mary", "Paul", "Sarah", "Bob", "Pam", "Charlie", "Jessy", "Carl","Martha"};
        char[] gpa = {'A', 'B', 'C', 'D', 'F', 'A', 'B', 'C', 'D', 'F'};
        
        input = JOptionPane.showInputDialog(null, "Enter a Student ID number");
        temp = Integer.valueOf(input);
        
        do {
            if(temp >= Integer.valueOf(ids[0]) && temp <= Integer.valueOf(ids[ids.length-1]) ) {
                for(int i = 0; i < ids.length; ++i) {
                    if(input.equals(ids[i])) {
                        JOptionPane.showMessageDialog(null, "Student ID: " + ids[i]
                                                            + "\nStudent name: " + names[i]
                                                            + "\nStudent gpa: " + gpa[i], "Report", JOptionPane.INFORMATION_MESSAGE);
                    }
                } 
            } else
                    JOptionPane.showMessageDialog(null, "Student ID " + input + " not valid. Try again.", "ERROR", JOptionPane.ERROR_MESSAGE);

            input = JOptionPane.showInputDialog(null, "Enter a Student ID number or \"zzz\" to quit");
            if(!input.equals("zzz"))
                temp = Integer.valueOf(input);
        } while(!input.equals("zzz"));
        
        JOptionPane.showMessageDialog(null, "Good-Bye");
    }
}