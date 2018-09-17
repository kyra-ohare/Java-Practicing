/*
 * Exercise 4, page 343.
 */

package javaprogramming.chapter06Looping;

import java.util.Scanner;

public class InBetween {

	public static void main(String[] args) {
		int first;
		int second;
		int i;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter one integer... ");
		first = input.nextInt();
		System.out.print("Enter another integer... ");
		second = input.nextInt();
		
		if(first > second) { //if first is greater than second, we swap them.
			int temp = first;
			first = second;
			second = temp;
			if((second - first) != 1) {
				if(first < second){
					for(i = first; first <= second; ++first)
						System.out.print(first + " ");
					
				} else
					for(i = second; second <= first; ++second)
						System.out.print(second + " ");
					
			} else
				System.out.println("No integers between them");
			
		} else
			if((second - first) != 1) {
				if(first < second){
					for(i = first; first <= second; ++first)
						System.out.print(first + " ");
					
				} else
					for(i = second; second <= first; ++second)
						System.out.print(second + " ");
					
			} else
				System.out.println("No integers between them");
		
			
		input.close();
	}

}
