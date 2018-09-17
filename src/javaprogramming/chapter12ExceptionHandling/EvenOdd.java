package javaprogramming.chapter12ExceptionHandling;

import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int number;
		
		System.out.print("Enter a number >>> ");
		number = input.nextInt();
		
		if(isEven(number))
			System.out.println(number + " is even.");
		else
			System.out.println(number + " is odd.");
		
		//System.out.println("\n" + number + " % 2 = " + result);
	}
	
	public static boolean isEven(int number) {
		boolean result;
		int ans = number % 2;
		if(ans == 1)
			result = false;
		else {
			result = true;
			assert ans == 0 : number + " % 2 is " + ans;
		}
		return result;
	}

}
