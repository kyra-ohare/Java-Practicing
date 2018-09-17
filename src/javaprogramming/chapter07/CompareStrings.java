package javaprogramming.chapter07;

import java.util.Scanner;

public class CompareStrings {

	public static void main(String[] args) {
		String aName;
		String anotherName;
		Scanner input = new Scanner(System.in);
		
		//equals();
		System.out.println("Enter your first name...");
		anotherName = input.nextLine();
		aName = "Kleyton";
		if(aName.equals(anotherName))
			System.out.println(aName + " equals " +anotherName);
		else
			System.out.println(aName + " does not equal " + anotherName);
		
		//equalsIgnoreCase()
		System.out.println("Enter your surname name...");
		anotherName = input.nextLine();
		aName = "Soares";
		if(aName.equalsIgnoreCase(anotherName))
			System.out.println(aName + " equals " +anotherName);
		else
			System.out.println(aName + " does not equal " + anotherName);

		//compareTo() - it compares Unicode
		System.out.println("Comparing Soares to OHare");
		aName = "Soares";
		anotherName = "OHare";
		System.out.println("Unicode 83(S) - 79(O): " + aName.compareTo(anotherName));
		input.close();
	}

}
