/*
 * Exercise 13, page 173.
 */
package javaprogramming.chapter03;

public class BankAccount{
	private String accountNumber;
	private String name;
	private double balance;
	private static double monthlyFee = 4;
	
	public BankAccount(){
		name = "XXX";
		accountNumber = "12345";
		balance = 0;
	}
	public String getName(){
		return name;
	}
	public void setName(String name){
		this.name = name;
	}
	public String getAccountNumber(){
		return accountNumber;
	}
	public void setAccountNumber(String accountNumber){
		this.accountNumber = accountNumber;
	}
	public double getBalance(){
		return balance;
	}
	public void setBalance(double balance){
		this.balance = balance;
	}
	public void deductMonthlyFee(){
		balance -= monthlyFee;
	}
	public static void explainAccountPolicy() {
		System.out.println("Monthly service fee of £4 applied.");
	}
	
	public void printAll(){
		System.out.println("Name: " + name);
		System.out.println("Account number: " + accountNumber);
		System.out.println("Balance: " + balance);
		System.out.println();
	}
}