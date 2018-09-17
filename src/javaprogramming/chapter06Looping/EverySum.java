/*
 * Exercise 6, page 343.
 */

package javaprogramming.chapter06Looping;

public class EverySum {
	public static void main(String[] args) {
		int sum = 0;
		System.out.print("sum: ");
		for(int i = 1; i <= 9; i ++) {
			sum += i;
			System.out.print(sum + " ");
		}
	}
}
