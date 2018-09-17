/*
 * Exercise 9, page 668.
 */
package javaprogramming.chapter12ExceptionHandling;

import java.util.Scanner;
import java.util.UUID;

public class GradeExceptionTest {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String user;
        int numOfStudents = 10;
        int counter = 1;
        String[] ids = new String[numOfStudents];
        char[] studentGrades = new char[numOfStudents];

        char entry;

        //initiate ids
        for (int i = 0; i < ids.length; ++i) {
            String id = UUID.randomUUID().toString().replaceAll("-", "").substring(0, 10);
            ids[i] = id;
        }

        System.out.println("Students' grades:");
        for (int i = 0; i < ids.length; ++i) {
            System.out.print(ids[i] + " >>>> ");
            user = input.next();
            entry = user.charAt(0);
            entry = Character.toUpperCase(entry);

            for (int j = 0; j < studentGrades.length; ++j) {
                try {
                    if (entry == GradeException.grades[j]) {
                        studentGrades[i] = entry;
                        break;
                    } else {
                        ++counter;
                        if(counter == GradeException.grades.length) {
                            throw new GradeException();
                        }
                    }
                } catch(GradeException e) {
                    System.err.println(e.getMessage());
                    studentGrades[i] = 'I';
                }
            }
            counter = 1;
        }
        
        System.out.println("\n**** REPORT ****");
        for (int m = 0; m < studentGrades.length; ++m) {
            System.out.println(ids[m] + ": " + studentGrades[m]);
        }
    }
}