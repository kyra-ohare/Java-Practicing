/*
 * Exercise 10, page 542.
*/
package javaprogramming.chapter10Inheritance;

public class Student extends Person {
    String major;
    double gpa;
    
    @Override
    public void settingData() {
        super.settingData();
        System.out.print("Student's major >>>> ");
            major = input.nextLine();
        System.out.print("Student's gpa >>>> ");
            gpa = input.nextDouble();
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Student's major: " + major + " GPA: " + gpa);
    }
}