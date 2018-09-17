package javaprogramming.chapter12ExceptionHandling;

public class CustomerAccount {
	private int num;
	private double balance;
	public static double HIGH_CREDIT_LIMIT = 20000.00;
	
	public CustomerAccount(int num, double balance) throws HighBalanceException {
		this.num = num;
		this.balance = balance;
		
		if(balance > HIGH_CREDIT_LIMIT)
			throw(new HighBalanceException());
	}
}
