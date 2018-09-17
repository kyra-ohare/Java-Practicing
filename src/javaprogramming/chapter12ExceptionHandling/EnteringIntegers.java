package javaprogramming.chapter12ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class EnteringIntegers {

	public static void main(String[] args) {
		int[] numberList = new int[] {0, 0, 0, 0, 0, 0};
		int x;
		Scanner input = new Scanner(System.in);
		
		for(x = 0; x < numberList.length; ++x) {
			try {
				System.out.print("Enter an integer >>>> ");
				numberList[x] = input.nextInt();
			} catch(InputMismatchException e) {
				System.out.println("Exception occurred.");
			} finally {
				
				input.nextLine(); //commenting this lines makes the user not be able to continues entering data even after an exception
			}
		}
		System.out.print("The numbers are: ");
		for(x = 0; x < numberList.length; ++x)
			System.out.print(numberList[x] + " ");
		System.out.println();
		
		if(input != null)
			input.close();
	}

}
