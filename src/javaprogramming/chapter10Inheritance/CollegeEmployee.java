/*
 * Exercise 10, page 542.
*/
package javaprogramming.chapter10Inheritance;

import java.util.InputMismatchException;

public class CollegeEmployee extends Person {
    String department;
    String ssn;
    double annualSalary;
    
    @Override
    public void settingData() {
        super.settingData();
        System.out.print("Department >>>> ");
            department = input.nextLine().toUpperCase();
        System.out.print("Social Security Number >>>> ");
            ssn = input.nextLine();
        System.out.print("Annual Salary >>>> ");
        try {
            annualSalary = input.nextDouble();
        } catch(InputMismatchException e) {
            System.out.println("ERROR: Digits only. Try again");
        }
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Deparment: " + department + " Social Security Number: " + ssn + " Annual Salary: " + annualSalary);
    }
}