package javaprogramming.chapter12ExceptionHandling;

public class DemoStackTrace2 {
	public static void main(String[] args) {
		methodA();
	}
	
	public static void methodA() {
		System.out.println("In methodA()");
		
		try {
			methodB();
		}
		catch (ArrayIndexOutOfBoundsException error)
		{
			System.out.println("In methodA() - The stack trace:");
			error.printStackTrace();
		}
		
		System.out.println("methodA() ends normally.");
		System.out.println("Application could continue from this point.");
	}
	
	public static void methodB() {
		System.out.println("In methodB()");
		methodC();
	}
	
	public static void methodC() {
		System.out.println("In methodC()");
		int[] array = {0, 1, 2};
		System.out.println(array[3]);
	}

}
