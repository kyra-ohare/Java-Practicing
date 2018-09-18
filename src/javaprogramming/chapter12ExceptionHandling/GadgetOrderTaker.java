/*
 * Exercise 13, page 670.
 */
package javaprogramming.chapter12ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GadgetOrderTaker {
    
    public static void main(String[] args) {
        Gadget[] gadgets = new Gadget[4];
            gadgets[0] = new Gadget(101, "Electrict hand warmer", 12.99);
            gadgets[1] = new Gadget(124, "Battery-operated plant waterer", 7.55);
            gadgets[2] = new Gadget(256, "Gerbil trimmer", 9.99);
            gadgets[3] = new Gadget(512, "Talking bookmark", 6.89);
        String name, address;
        int orderNumber = 101, itemCode = 0, quantity = 0, counter = 0;
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
            for(Gadget temp : gadgets) { //display the gadgets.
                temp.display();
            }
            while(true) { //asks for the information until an exception happens
                System.out.print("Item code (or 999 to finish your order) >>>> ");
                try {    
                    itemCode = input.nextInt();
                    input.nextLine();
                    if(itemCode == 999) {
                        System.out.println("Bye " + name);
                        break;
                    }
                    { //counts how many attempts to find an Item Number otherwise an exception is thrown
                        int counter2 = 0;
                        for(Gadget temp : gadgets) {
                            if(itemCode != temp.getItemNumber())
                                ++counter2;
                            if(counter2 == gadgets.length)
                                throw new OrderException("Item Code not valid!");
                        }
                    }
                    System.out.print("Quantity >>>> ");
                        quantity = input.nextInt();
                        input.nextLine();
                        
                    if(counter == 4) //only 4 orders per person is possible
                        throw new OrderException("You've reached your limit! Thanks for shopping with us.");
                    else if(quantity > 100)
                        throw new OrderException("You've ordered more than 100 of the same item");
                        
                    for(Gadget temp : gadgets) {
                        if(itemCode == temp.getItemNumber()) {
                            list[i] = temp;
                            total += (temp.getPrice() * quantity);
                        }
                    }
                    ++counter; //this counts the number of orders per person
                } catch(InputMismatchException e) {
                    System.out.println("ERROR: not a number!");
                    input.next();
                } catch(OrderException e) {
                    System.out.println(e.getMessage());
                    break;
                }
            }
            counter = 0; //counter is initializer for the next customer
            orders[i] = new Order(orderNumber, name, address, list, total, shippingHandlingFee(total));
        }
        
        for(Order temp : orders) { //display the orders
            if(temp != null)
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