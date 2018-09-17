/*
 * Exercise 4, page 388.
 */
package Chapter07;

import java.util.Scanner;

public class CountMatches {
	public static void main(String[] args) {
		String str1;
		String str2;
		Scanner input = new Scanner(System.in);

		System.out.print("Enter a string >> ");
		str1 = input.nextLine();
		System.out.print("Enter another string >> ");
		str2 = input.nextLine();

		getMatchedString(str1, str2);
		input.close();
	}

	public static void getMatchedString(String one, String two) {
		char[] array1 = one.toCharArray();
		char[] array2 = two.toCharArray();
		int counter = 0;

		for(int i = 0; i < array1.length; i++) {
			for(int j = 0; j < array2.length; j++) {
				if(one.charAt(i) == two.charAt(j)) //OR (as below)
					counter ++;
			}
		}
		System.out.println(counter + " characters in " + one + " are also found in " + two + ".");
		
		System.out.println("The characters in " + one + " that are also in " + two + " are as follows:");
		for(int i = 0; i < array1.length; i++) {
			for(int j = 0; j < array2.length; j++) {
				if(array1[i] == array2[j])
					System.out.print(" " + array1[i]);
			}
		}
	}

}
