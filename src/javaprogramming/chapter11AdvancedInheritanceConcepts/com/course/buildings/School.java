/*
 * Exercise 14, page 598.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts.com.course.buildings;

public class School extends Building {
    private int numOfClassrooms;
    private String gradeLevel;

    public int getNumOfClassrooms() {
        return numOfClassrooms;
    }

    public void setNumOfClassrooms(int numOfClassrooms) {
        this.numOfClassrooms = numOfClassrooms;
    }

    public String getGradeLevel() {
        return gradeLevel;
    }

    public void setGradeLevel(String gradeLevel) {
        this.gradeLevel = gradeLevel;
    }
}