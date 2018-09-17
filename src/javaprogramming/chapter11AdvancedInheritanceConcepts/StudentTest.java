/*
 * Exercise 13, page 598.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts;

public class StudentTest {
    
    public static void main(String[] args) {
        Student[] students = new Student[2];
        students[0] = new FullTime();
        students[1] =  new PartTime();
        
        for(Student temp : students) {
            if(temp instanceof FullTime) {
                temp.tuition();
            } else
                temp.tuition();
        }
    }
}