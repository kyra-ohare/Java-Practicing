/*
 * Exercise 13, page 173.
 */
package javaprogramming.chapter03;

import java.util.Scanner;

public class BankAccountTest {
	public static void main(String[] args){
		BankAccount acc1;
		BankAccount acc2;
		BankAccount acc3;
		BankAccount acc4;
		
		acc1 = getData();
		acc2 = getData();
		acc3 = getData();
		acc4 = getData();
		
		acc1.printAll();
		acc2.printAll();
		acc3.printAll();
		acc4.printAll();
		
		BankAccount.explainAccountPolicy();
		acc1.deductMonthlyFee();
		acc2.deductMonthlyFee();
		acc3.deductMonthlyFee();
		
		acc1.printAll();
		acc2.printAll();
		acc3.printAll();
		acc4.printAll();
	}
	
	public static BankAccount getData(){
		BankAccount tempAcc = new BankAccount();
		String name;
		String accountNumber;
		double balance;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Name: ");
		name = input.nextLine();
		tempAcc.setName(name);
		System.out.print("Account number:");
		accountNumber = input.nextLine();
		tempAcc.setAccountNumber(accountNumber);
		System.out.print("Balance:");
		balance = input.nextDouble();
		tempAcc.setBalance(balance);
		System.out.println();
		
		if(input != null)
			input.close();
		
		return tempAcc;
	}
}