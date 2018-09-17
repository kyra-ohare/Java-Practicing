/*
 * Exercise 7, page 437.
 */
package javaprogramming.chapter08Arrays;

import java.util.*;

public class InputGrades {
    public static void main(String[] args) {
        final int NUM_OF_STUDENTS = 2;
        final int NUM_OF_COURSES = 2;
        Student student;
        String info;
        int infoInt;
        Student[] students = new Student[NUM_OF_STUDENTS];
        CollegeCourse[] courses = new CollegeCourse[NUM_OF_COURSES];
        
        Scanner input = new Scanner(System.in);
        
        System.out.println(" Welcome to Java Programming.\n   Professor, enter your students' info below.");
        for(int i = 0; i < students.length; i++) {
            students[i] = new Student();
            System.out.print("\nEnter ID for student " + (i+1) + " >>>> ");
            infoInt = input.nextInt();
            input.nextLine();
            students[i].setStudentID(infoInt);

            for(int j = 0; j < courses.length; j++) {
                courses[j] = new CollegeCourse();
                System.out.print("Enter ID course " + (j+1) + " >>>> ");
                info = input.nextLine();
                courses[j].setCourseID(info);

                System.out.print("Enter credit hours >>>> ");
                infoInt = input.nextInt();
                input.nextLine();
                courses[j].setCreditHours(infoInt);

                System.out.print("Enter letter grade >>>> ");
                info = input.nextLine();
                while(info.toUpperCase().charAt(0) != 'A' && info.toUpperCase().charAt(0) != 'B' && info.toUpperCase().charAt(0) != 'C' && info.toUpperCase().charAt(0) != 'D' && info.toUpperCase().charAt(0) != 'F') {
                    System.out.print("\nInvalid Grade Letter. You should use A, B, C, D or F. Try again!\nEnter letter grade >>>> ");
                    info = input.nextLine();
                }
                courses[j].setLetterGrade(info.toUpperCase().charAt(0));
            }
        }
        System.out.println();
        int k = 0;
        for(int i = 0; i < students.length; i++) {
            students[i].display();
            for( ; k < courses.length; k++) {
                    courses[k].display();
            }
            k = 0;
            System.out.println();
        }
    }
}