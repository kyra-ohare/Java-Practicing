/*
 * Exercise 13, page 670.
 */
package javaprogramming.chapter12ExceptionHandling;

import java.util.Scanner;

public class GadgetOrderTaker {
    
    public static void main(String[] args) {
        Gadget[] gadgets = new Gadget[4];
            gadgets[0] = new Gadget(101, "Electrict hand warmer", 12.99);
            gadgets[1] = new Gadget(124, "Battery-operated plant waterer", 7.55);
            gadgets[2] = new Gadget(256, "Gerbil trimmer", 9.99);
            gadgets[3] = new Gadget(512, "Talking bookmark", 6.89);
        String name, address;
        int orderNumber = 101, itemCode, quantity, counter = 0;
        double total = 0;
        Gadget[] list = new Gadget[4];
        Scanner input = new Scanner(System.in);
        Order[] orders = new Order[1];
        
        for(int i = 0; i < orders.length; ++i) {
            orderNumber++;
            System.out.print("Name >>>> ");
                name = input.nextLine();
            System.out.print("Address >>>> ");
                address = input.nextLine();
            System.out.println("**** Our Gadgets ****");
            for(Gadget temp : gadgets) {
                temp.display();
            }
            do {
                ++counter;
                System.out.print("Item code (or 999 to finish your order) >>>> ");
                    itemCode = input.nextInt();
                    input.nextLine();
                if(itemCode == 999)
                    break;
                System.out.print("Quantity >>>> ");
                    quantity = input.nextInt();
                    input.nextLine();
                for(int j = 0; j < gadgets.length; ++j) {
                    if(itemCode == gadgets[i].getItemNumber()) {
                        if(list[i] != null) {
                            list[i] = gadgets[i];
                            total += (gadgets[i].getPrice() * quantity);
                        }
                    }
                }
                //System.out.println("counter: " + counter);
                //System.out.println("(itemCode != 999 || counter != 4)" + (itemCode != 999 || counter != 4));
            } while(counter != 4);
            counter = 0;
            orders[i] = new Order(orderNumber, name, address, list, total, shippingHandlingFee(total));
        }
        
        for(Order temp : orders) {
            temp.display();
        }
    }
    
    public static double shippingHandlingFee(double total) {
        if(total <= 24.99)
            return 5.55;
        else if(total >= 25 && total <= 49.99)
            return 8.55;
        else
            return 11.55;
    }
}