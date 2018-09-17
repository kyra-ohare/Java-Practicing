/*
 * Exercise 1, page 387.
 */
package javaprogramming.chapter07;

import java.util.Scanner;

public class BabyNameComparison {
	public static void main(String[] args) {
		Scanner keyboard = new Scanner(System.in);
		String input1, name1;
		String input2, name2;
		String input3, name3;
		
		System.out.println("Enter three names");
		input1 = keyboard.nextLine();
		name1 = input1 + " ";
		input2 = keyboard.nextLine();
		name2 = input2 + " ";
		input3 = keyboard.nextLine();
		name3 = input3 + " ";
		
		String first = name1.concat(name2);
		String second = name1.concat(name3);
		String third = name2.concat(name1);
		String fourth = name2.concat(name3);
		String fifth = name3.concat(name1);
		String sixth = name3.concat(name2);
		
		System.out.println();
		System.out.println("Possibilities of names are:\n" + first + "\n" + second + "\n" + third + "\n" + fourth + "\n" + fifth + "\n" + sixth);
		
		if(keyboard != null)
			keyboard.close();
	}
}
