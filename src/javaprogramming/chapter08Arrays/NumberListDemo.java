/*
 * Exercise 4, page 437
 */
package javaprogramming.chapter08Arrays;

import java.util.*;

public class NumberListDemo {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int user;
		final int LIMIT = 5;
		final int QUIT = 999;
		int[] numbers = new int[LIMIT];
		int number;
		int total = 0;
		int i;
		int counter = 0;
		int counter2 = 5;
		
		do {
			System.out.print("Enter up to " + counter2 + " integers or " + QUIT + " to quit >> ");
			user = input.nextInt();
			if(user != QUIT)
				numbers[counter] = user;
			counter2--;
			counter++;
		} while(counter < LIMIT && user != QUIT);
		number = numbers[0];
		
		System.out.println();
		System.out.print("1. Entered integers are: ");
		for(i = 0; i < numbers.length; ++i) {
			System.out.print(numbers[i] + " ");
		}
		
		System.out.println();
		System.out.print("2. Reversed entered integers are: ");
		for(i = (numbers.length-1); i >= 0; --i) {
			System.out.print(numbers[i] + " ");
		}
		
		System.out.println();
		System.out.print("3. The sum of integers: ");
		for(i = 0; i < numbers.length; ++i) {
			total += numbers[i];
		}
		System.out.println(total);
		
		System.out.print("4. Values less than 5: ");
		for(i = 0; i < numbers.length; ++i) {
			if(numbers[i] < 5)
				System.out.print(numbers[i] + " ");
		}
		
		System.out.println();
		System.out.print("5. The lowest value: ");
		for(i = 0; i < numbers.length; ++i) {
			if(numbers[i] < number){
				number = numbers[i];
			}
		}
		System.out.println(number);
		
		System.out.print("6. The highest value: ");
		for(i = 0; i < numbers.length; ++i) {
			if(numbers[i] > number){
				number = numbers[i];
			}
		}
		System.out.println(number);
		total = 0;
		System.out.print("7. The average of integers: ");
		for(i = 0; i < numbers.length; ++i) {
			total += numbers[i];
			number = total / LIMIT;
		}
		System.out.println(number);
		
		System.out.print("8. Numbers higher than the average of " + number +": ");
		for(i = 0; i < numbers.length; ++i) {
			if(numbers[i] > number)
				System.out.print(numbers[i] + " ");
		}
		input.close();
	}

}
