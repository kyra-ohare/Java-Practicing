/*
 * Exercise 8, page 541.
*/
package javaprogramming.chapter10Inheritance;

public class LabCourse extends CollegeCourse {
    double labCourseFee = 50;
    
    public LabCourse(String department, String courseNumber, int credit) {
        super(department, courseNumber, credit);
        total += 50;
    }
    
    @Override
    public void display() {
        System.out.println("This is a Lab Course");
        super.display();
    }        
}