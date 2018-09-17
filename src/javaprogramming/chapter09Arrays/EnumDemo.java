package javaprogramming.chapter09Arrays;

/*
 * enum are type-safe which describes a data type for which only appropriate behaviours are allowed.
 */
import java.util.Scanner;

public class EnumDemo {
	//Month is in capital letter because it is a class.
	//constants are not strings therefore they are not enclosed in quotes; they are Java identifiers.
	//enum must never be declared within a method.
	enum Month {JAN, FEB, MAR, APR, MAY, JUN, JUL, AUG, SEP, OCT, NOV, DEC};
	
	public static void main(String[] args) {
		Month birthMonth;
		String userEntry;
		int position;
		int comparison;
		Scanner input = new Scanner(System.in);
		
		System.out.println("The months are:");
		
		for(Month mon : Month.values()) //values() returns an array of the enumerated constants.
			System.out.print(mon + " ");
		
		System.out.print("\n\nEnter the first three letters of your birth month >> ");
		userEntry = input.nextLine().toUpperCase();
		birthMonth = Month.valueOf(userEntry); //valueOf() method accepts a string parameter and returns an enumeration constant.
		System.out.println("You entered " + birthMonth);
		
		position = birthMonth.ordinal(); //ordinal() returns an integer that represents the constant's position in the list of constants. As with arrays, the first position is 0.
		System.out.println(birthMonth + " is in position " + position);
		System.out.println("So its month number is " + (position + 1));
		
		comparison = birthMonth.compareTo(Month.JUN); //comparteTo() returns a negative integer if the calling object's ordinal value is less than that of the argument, 0 if they are the same, and a positive integer if the calling object's ordinal value is greater than that of the argument.
		if(comparison < 0)
			System.out.println(birthMonth + " is earlier in the year than " + Month.JUN);
		else
			if
			(comparison > 0)
				System.out.println(birthMonth + " is later in the year than " + Month.JUN);
			else
				System.out.println(birthMonth + " is " + Month.JUN);
		
		input.close();
	}

}
