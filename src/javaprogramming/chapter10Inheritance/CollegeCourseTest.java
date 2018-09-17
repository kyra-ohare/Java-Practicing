/*
 * Exercise 8, page 541.
*/
package javaprogramming.chapter10Inheritance;

import java.util.Scanner;

public class CollegeCourseTest {
    public static void main(String[] args) {
        String department;
        String courseNumber;
        int credit;
        CollegeCourse cc = null;
        LabCourse lc = null;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter deparment >>>> ");
            department = input.nextLine().toUpperCase();
        System.out.print("Enter course number >>>> ");
            courseNumber = input.nextLine();
        System.out.print("Enter number of credits >>>> ");
            credit = input.nextInt();
        
        switch(department) {
            case "BIO":
            case "CHM":
            case "CIS":
            case "PHY":
                lc = new LabCourse(department, courseNumber, credit);
                System.out.println("");
                lc.display();
                break;
            default:
                cc = new CollegeCourse(department, courseNumber, credit);
                System.out.println("");
                cc.display();
                break;
        }
    }
}