/*
 * Exercise 10, page 542.
*/
package javaprogramming.chapter10Inheritance;

import java.util.Scanner;

public class CollegeListTest {
    public static void main(String[] args) {
        Person[] ce = new CollegeEmployee[2];
        Person[] fa = new Faculty[2];
        Person[] st = new Student[2];
        String answer;
        int counter = 0;
        //, counter2 = 0, counter3 = 0;
        Scanner input = new Scanner(System.in);
        
            
        do {
            System.out.print("Which type of person: C (College Employee), F (Faculty), S (Student) or Q (Quit) >>>> ");
                answer = input.nextLine().toUpperCase();
            switch(answer.charAt(0)) {
                case 'C': //CollegeEmployee()
                    for(int i = 0; i < ce.length; ++i) {
                        if(ce[i] == null) {
                            ce[i] = new CollegeEmployee();
                            ce[i].settingData();
                            break;
                        } else {
                            ++counter;
                            if(ce.length == counter)
                                System.out.println("College Employee Database is full.");
                        }
                    }
                    counter = 0;
                    break;
                case 'F': //Faculty()
                    for(int i = 0; i < fa.length; ++i) {
                        if(fa[i] == null) {
                            fa[i] = new Faculty();
                            fa[i].settingData();
                            break;
                        } else {
                            ++counter;
                            if(fa.length == counter)
                                System.out.println("Faculty Database is full.");
                        }
                    }
                    counter = 0;
                    break;
                case 'S': //Student(()
                    for(int i = 0; i < st.length; ++i) {
                        if(st[i] == null) {
                            st[i] = new Student();
                            st[i].settingData();
                            break;
                        } else {
                            ++counter;
                            if(st.length == counter)
                                System.out.println("Faculty Database is full.");
                        }
                    }
                    counter = 0;
                    break;
                case 'Q': //Quit
                    System.out.println("College Employees");
                    for(int i = 0; i < ce.length; ++i) {
                        if(ce[i] != null)
                            ce[i].displayInfo();
                         else {
                            ++counter;
                            if(counter == ce.length)
                                System.out.println("Database is empty.");
                        }
                    }
                    counter = 0;
                    System.out.println();

                    System.out.println("Faculty");
                    for(int i = 0; i < fa.length; ++i) {
                        if(fa[i] != null)
                            fa[i].displayInfo();
                        else {
                            ++counter;
                            if(counter == ce.length)
                                System.out.println("Database is empty.");
                        }
                    }
                    counter = 0;
                    System.out.println();

                    System.out.println("Students");
                    for(int i = 0; i < st.length; ++i) {
                        if(st[i] != null)
                            st[i].displayInfo();
                         else {
                            ++counter;
                            if(counter == ce.length)
                                System.out.println("Database is empty.");
                        }
                    }
                    counter = 0;
                    System.out.println();

                    break;
                default:
                    System.out.println("Not a valid option. Try again!");    
                    break;
            }
        } while(answer.charAt(0) != 'Q');
    }
}