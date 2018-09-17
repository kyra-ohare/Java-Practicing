package javaprogramming.chapter12ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionMistakeCaught {

	public static void main(String[] args) {
		int numerator, denominator, result;
		Scanner input = new Scanner(System.in);
		
		try {
			System.out.print("Enter numerator >>> ");
			numerator = input.nextInt();
			
			System.out.print("Enter denominator >>> ");
			denominator = input.nextInt();
			
			result = numerator / denominator;
			System.out.println(numerator + " / " + denominator + " = " + result);
		} catch(ArithmeticException mistake) {
			System.err.println("1st: Attempt to divide by zero.");
			System.err.println("2nd: " + mistake.getMessage());
		} catch(InputMismatchException mis) {
			System.err.println("1st: Wrong data type.");
			System.err.println("2nd: " + mis.getMessage());
			
			//Exception is a "bigger basket": all other exceptions like Arithmetic and InputMismatch are subclasses.
		} catch(Exception message) {
			System.err.println("1st: Operation unsuccessful.");
			System.err.println("2nd: " + message.getMessage());
		}
		System.out.println("End of program.\n");

		if(input != null)
			input.close();
	}

}
