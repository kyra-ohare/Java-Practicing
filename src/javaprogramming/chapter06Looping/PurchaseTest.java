package javaprogramming.chapter06Looping;

import java.util.Scanner;

public class PurchaseTest {

	public static void main(String[] args) {
		int invoiceNumber;
		int amountOfSale;
		int MIN_LIMIT = 1000;
		int MAX_LIMIT = 8000;
		Scanner input = new Scanner(System.in);
		
		Purchase purchase1 = new Purchase();
		
		System.out.print("Enter the invoice number >> ");
		invoiceNumber = input.nextInt();
		while(invoiceNumber < MIN_LIMIT || invoiceNumber > MAX_LIMIT) {
			System.out.println("Error: invalid data. Enter a number between " + MIN_LIMIT + " and " + MAX_LIMIT + ".");
			System.out.print("Enter the invoice number >> ");
			invoiceNumber = input.nextInt();
		}
		purchase1.setInvoiceNumber(invoiceNumber);
		
		System.out.print("Enter the amount of sale >>");
		amountOfSale = input.nextInt();
		while(amountOfSale < 0) {
			System.out.println("Error: invalid data. Try again!");
			System.out.print("Enter the amount of sale >>");
			amountOfSale = input.nextInt();
		}
		purchase1.setAmountOfSale(amountOfSale);
		purchase1.setAmountOfSalesTax(amountOfSale);
		
		purchase1.display();
		
		if(input != null)
			input.close();
	}

}
