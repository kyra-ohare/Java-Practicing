/*
 * Exercise 7, page 437.
 */
package javaprogramming.chapter08Arrays;

public class CollegeCourse {
    private String courseID;
    private int creditHours;
    private char letterGrade;

    public String getCourseID() {
        return courseID;
    }

    public void setCourseID(String courseID) {
        this.courseID = courseID;
    }

    public int getCreditHours() {
        return creditHours;
    }

    public void setCreditHours(int creditHours) {
        this.creditHours = creditHours;
    }

    public char getLetterGrade() {
        return letterGrade;
    }

    public void setLetterGrade(char letterGrade) {
        this.letterGrade = letterGrade;
    }

    public void display() {
        System.out.println("Course ID: " + getCourseID());
        System.out.println("Credit Hours: " + getCreditHours());
        System.out.println("Letter Grade: " + getLetterGrade());
    }
}