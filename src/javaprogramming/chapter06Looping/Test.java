package javaprogramming.chapter06Looping;

public class Test {
	public static void main(String[] args) {
		whileLoop();
		forLoop();
//		increment();
//		nestedForLoops();
		compareToZero();
//		compareFixes();
	}
	
	//method using a while loop
	public static void whileLoop() {
		System.out.println("whileLoop");
		int i = 1;
		final int LIMIT = 11;
		while(i < LIMIT) {
			System.out.print(i + " "); //Result: 1 2 3 4 5 6 7 8 9 10
			i++;
		}
		System.out.println();
	}
	//method using a for loop
	public static void forLoop() {
		System.out.println("forLoop");
		int j;
		for(j = 10; j > 0; j--) {
			System.out.print(j + " "); //Result: 10 9 8 7 6 5 4 3 2 1
		}
		System.out.println();
	}
	
	//method using 4 different forms to increment
	public static void increment() {
		int value;
		value = 14;
		++value; //Result: value is 15
		System.out.println("First: " + value);
		value = 24;
		value++; //Result: value is 25
		System.out.println("Second: " + value);
		value = 34;
		value = value + 1; //Result: value is 35
		System.out.println("Third: " + value);
		value = 44;
		value += 1; //Result: value is 45;
		System.out.println("Fourth: " + value);
	}
	
	public static void nestedForLoops() {
		for(int x = 0; x < 2; ++x) {
			for(int y = 0; y < 2; ++y)
				for(int k = 0; k < 2; ++k)
					for(int t = 0; t < 2; ++t)
						System.out.println(x + " " + y + " " + k + " " + t + " " +"Hi");
		}
	}
	//comparing to 0 is believed to be faster than other values.
	public static void compareToZero() {
		long startTime1, startTime2, endTime1, endTime2;
		final long REPEAT = 10000L;
		
		startTime1 = System.currentTimeMillis();
		for(int x = 0; x <= REPEAT; ++x)
			for(int y = 0; y <= REPEAT; ++y);
		endTime1 = System.currentTimeMillis();
		System.out.println("Time for loops starting from 0: " + (endTime1-startTime1) + " milliseconds.");
		
		startTime2 = System.currentTimeMillis();
		for(long x = REPEAT; x >= 0; --x)
			for(long y = REPEAT; y >= 0; --y);
		endTime2 = System.currentTimeMillis();
		System.out.println("Time for loops ending at 0: " + (endTime2-startTime2) + " milliseconds.");
	}
	//prefix is believed to be faster than postfix.
	public static void compareFixes() {
		long startTime1, startTime2, endTime1, endTime2;
		final long REPEAT = 10000000L;
		
		startTime1 = System.currentTimeMillis();
		for(int x = 0; x < REPEAT; x++);
		endTime1 = System.currentTimeMillis();
		System.out.println("Time with postfix increment: " + (endTime1-startTime1) + " milliseconds.");
		
		startTime2 = System.currentTimeMillis();
		for(int x = 0; x <= REPEAT; ++x);
		endTime2 = System.currentTimeMillis();
		System.out.println("Time with prefix increment: " + (endTime2-startTime2) + " milliseconds.");
	}
}
