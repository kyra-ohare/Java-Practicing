/*
 * Exercise 6, page 389.
 */
package javaprogramming.chapter07;

import java.util.Scanner;

public class Alphabetize {

	public static void main(String[] args) {
		String str1;
		String str2;
		String str3;
		String temp;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter your first string >> ");
		str1 = input.nextLine();
		System.out.print("Enter your second string >> ");
		str2 = input.nextLine();
		System.out.print("Enter your third string >> ");
		str3 = input.nextLine();
		
		if(str1.compareToIgnoreCase(str2) > 0) {
			temp = str1;
			str1 = str2;
			str2 = temp;
		}
		if(str1.compareToIgnoreCase(str3) > 0) {
			temp = str1;
			str1 = str3;
			str3 = temp;
		}
		if(str2.compareToIgnoreCase(str3) > 0) {
			temp = str2;
			str2 = str3;
			str3 = temp;
		}
		
		System.out.println(str1 + " " + str2 + " " + str3);
		
		input.close();
	}

}
