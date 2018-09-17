package javaprogramming.chapter12ExceptionHandling;

@SuppressWarnings("serial")
public class MenuException extends Exception {
	
	public MenuException(String choice) {
		super(choice);
	}
}
