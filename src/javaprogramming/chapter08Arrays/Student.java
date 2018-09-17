/*
 * Exercise 7, page 437.
 */
package javaprogramming.chapter08Arrays;

public class Student {
    private int studentID;
    public final int NUM_OF_COURSES = 5;
    public CollegeCourse[] courses = new CollegeCourse[NUM_OF_COURSES];

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public CollegeCourse getCourses(int number) {
        return (number >= 0 && number < NUM_OF_COURSES) ? courses[number] : null;
    }
    
    public void setCollegeCourses(int number, CollegeCourse course) {
        if(number >= 0 && number < NUM_OF_COURSES)
            this.courses[number] = course;
    }

    public void display() {
        System.out.println("Student ID: " + getStudentID());
    }
}