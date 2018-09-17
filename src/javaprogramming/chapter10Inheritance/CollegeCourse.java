/*
 * Exercise 8, page 541.
*/
package javaprogramming.chapter10Inheritance;

public class CollegeCourse {
    String department;
    String courseNumber;
    int credit;
    double courseFee = 120; //per credits
    double total;
    
    public CollegeCourse(String department, String courseNumber, int credit) {
        this.department = department;
        this.courseNumber = courseNumber;
        this.credit = credit;
        for(int i = 1; ;++i) {
            total += courseFee;
            if(i == credit)
                break;
        }
    }
    
    public void display() {
        System.out.println("Department: " + department + " Course Number: " + courseNumber + "\nCredit: " + credit + " Course Fee: " + total);
    }
}