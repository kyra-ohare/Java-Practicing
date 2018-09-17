/*
 * Exercise 5, page 492.
 */
package javaprogramming.chapter09Arrays;

import java.util.InputMismatchException;
import java.util.Scanner;
import javaprogramming.chapter08Arrays.Salesperson;

public class SalespersonDatabase {
    public static void main(String[] args) {
        final int MAX_ENTRIES = 4;
        Salesperson[] salespeople = new Salesperson[MAX_ENTRIES];
        //Examples
            salespeople[0] = new Salesperson(1, 100);
            salespeople[1] = new Salesperson(2, 200);
            salespeople[2] = new Salesperson(3, 300);
        String answer;
        int id;
        int value;
        Scanner input = new Scanner(System.in);
        
        do {
            System.out.print("Would you like to (1) Add; (2) Delete or (3) Update any records? ");
            answer = input.nextLine();
            
            switch(Integer.parseInt(answer)) {
                case 1: //ADDING DATA
                    int counter1 = 0;
                    exit:
                    for(int i = 0; i < salespeople.length; ++i) {
                        if(salespeople[i] == null) { //look for null data to add
                            System.out.print("ID Number for adding: ");
                            try {
                                id = input.nextInt();
                                input.nextLine();
                            } catch(InputMismatchException e) {
                                System.out.println("ERROR: Digits only.");
                                input.nextLine();
                                break;
                            }
                            for(int j = 0; j < salespeople.length; ++j) { //look for ids
                                if(salespeople[j] != null && salespeople[j].getID() == id) { //if existed ID is found
                                    System.out.println("ERROR: ID number already exists");
                                    break exit;
                                } 
                                if(salespeople[j] == null) { //if no existed ID is found
                                    System.out.print("Value: ");
                                    try {
                                        value = input.nextInt();
                                        input.nextLine();
                                    } catch(InputMismatchException e) {
                                        System.out.println("ERROR: Digits only.");
                                        input.nextLine();
                                        break exit;
                                    }
                                    salespeople[j] = new Salesperson(id, value); //create a Salesperson
                                    break exit;
                                }
                            }
                        } else {
                            ++counter1; //counter for NOT null indeces
                            if(salespeople.length == counter1)
                                System.out.println("ERROR: Database is full");
                        }
                    }
                    break;
                case 2: //DELETING DATA
                    exit:
                    for(int i = 0; i < salespeople.length; ++i) {
                        if(salespeople[i] != null) { //look for existent objects
                            System.out.print("ID Number for deletion: ");
                            try {
                                id = input.nextInt();
                                input.nextLine();
                            } catch(InputMismatchException e) {
                                System.out.println("ERROR: Digits only.");
                                input.nextLine();
                                break;
                            }
                            for(int j = 0; j < salespeople.length; ++j) { //look for ids
                                if(salespeople[j] != null && salespeople[j].getID() == id) { //look for existent matching id
                                    salespeople[j].display();
                                    System.out.print("Do you wish to delete this record (Y/N)? ");
                                        answer = input.nextLine();
                                    if(answer.charAt(0) == 'y' || answer.charAt(0) == 'Y') {
                                        salespeople[j] = null; //delete existent object
                                        System.out.println("Record deleted successfully");
                                        break exit;
                                    } else {
                                        System.out.println("Record NOT deleted");
                                        break exit;
                                    }
                                }
                                if(salespeople[j] == null) {
                                    System.out.println("ERROR: ID number not existent");
                                    break exit;
                                }
                            }
                        } else {
                            System.out.println("ERROR: Database is empty");
                            break;
                        }
                    }
                    break;
                case 3: //UPDATING DATA
                    int counter3 = 0;
                    exit:
                    for(int i = 0; i < salespeople.length; ++i) {
                        if(salespeople[i] != null) { //look for existent objects
                            System.out.print("ID Number for update: ");
                            try {
                                id = input.nextInt();
                                input.nextLine();
                            } catch(InputMismatchException e) {
                                System.out.println("ERROR: Digits only.");
                                input.nextLine();
                                break;
                            }
                            for(int j = 0; j < salespeople.length; ++j) { //look for ids
                                if(salespeople[j] != null && salespeople[j].getID() == id) { //look for matching id
                                    salespeople[j].display();
                                    System.out.print("Do you wish to update this record (Y/N)? ");
                                        answer = input.nextLine();
                                    if(answer.charAt(0) == 'y' || answer.charAt(0) == 'Y') {
                                        System.out.print("New Value: ");
                                        try {
                                            value = input.nextInt();
                                            input.nextLine();
                                        } catch(InputMismatchException e) {
                                            System.out.println("ERROR: Digits only.");
                                            input.nextLine();
                                            break exit;
                                        }
                                        salespeople[j].setSalesAmount(value); //update salesAmount
                                        System.out.println("Successful Update");
                                        break exit;
                                    } else {
                                        System.out.println("Record NOT updated");
                                        break exit;
                                    }
                                }
                                if(salespeople[j] == null) {
                                    System.out.println("ERROR: ID number not existent");
                                    break exit;
                                }
                            }
                        } else {
                            ++counter3; //counter for null indeces
                            if(salespeople.length == counter3)
                                System.out.println("ERROR: Database is empty");
                        }
                    }
                    break;
            }
            for(Salesperson temp : salespeople) {
                if(temp != null)
                    temp.display();
            }
            System.out.println();
            System.out.print("Would you like to continue (Y/N)? ");
            answer = input.nextLine();
        } while(answer.charAt(0) == 'y' || answer.charAt(0) == 'Y');
        System.out.println("Bye");
    }
}