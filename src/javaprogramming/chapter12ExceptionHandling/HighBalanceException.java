package javaprogramming.chapter12ExceptionHandling;

@SuppressWarnings("serial")
public class HighBalanceException extends Exception {
	
	public HighBalanceException() {
		super("Customer balance is high.");
	}
}
