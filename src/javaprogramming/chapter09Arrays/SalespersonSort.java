package javaprogramming.chapter09Arrays;

import java.util.Scanner;
import javaprogramming.chapter08Arrays.Salesperson;

public class SalespersonSort {
    public static void main(String[] args) {
        double value;
        String answer;
        final int MAX_ENTRIES = 7;
        Salesperson[] salespeople = new Salesperson[MAX_ENTRIES];
        Scanner input = new Scanner(System.in);

        for(int i = 0; i < salespeople.length; ++i) {
            int id = i + 1001;
            System.out.print("Sales value for " + id + " >>>> ");
            value = input.nextDouble();
            input.nextLine();
            salespeople[i] = new Salesperson(id, value);
        }
        
        do {
            System.out.println("How would you like to sort data?"
                    + "\n1. by ID or 2. by Sales Values");
            answer = input.nextLine();
            
            Salesperson temporary;
            int length = salespeople.length - 1;
            switch(Integer.parseInt(answer)) {
                case 1:
                    for(int i = 0; i < length; ++i) {
                        for (int j = 0; j < length; ++j) {
                            if(salespeople[j].getID() > salespeople[j + 1].getID()) {
                                temporary = salespeople[j];
                                salespeople[j] = salespeople[j + 1];
                                salespeople[j + 1] = temporary;
                            }
                        }
                    }
                    for(Salesperson temp : salespeople)
                        temp.display();
                    break;
                case 2:
                    for(int i = 0; i < length; ++i) {
                        for (int j = 0; j < length; ++j) {
                            if(salespeople[j].getSalesAmount()> salespeople[j + 1].getSalesAmount()) {
                                temporary = salespeople[j];
                                salespeople[j] = salespeople[j + 1];
                                salespeople[j + 1] = temporary;
                            }
                        }
                    }
                    for(Salesperson temp : salespeople)
                        temp.display();
                    break;
            }
            
            System.out.print("Would you like to sort it again? ");
            answer = input.nextLine();
        } while(answer.charAt(0) == 'y');
        System.out.println("Bye");
    }
}
