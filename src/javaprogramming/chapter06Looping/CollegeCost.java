package javaprogramming.chapter06Looping;

import java.util.Scanner;

public class CollegeCost {
	static int LIMIT_AGE = 18;
	static double result;

	public static void main(String[] args) {
		int age;
		int amount;
		Scanner input = new Scanner(System.in);

		do {
		System.out.println("What's the kid's age?");
		age = input.nextInt();
		System.out.println("What's the estimated college cost for the kid's 18th birthday?");
		amount = input.nextInt();
		} while(age > LIMIT_AGE);
		
		System.out.print("You will need to save anually......€");
		System.out.println(result = calculation(age, amount));
		
		if(input != null)
			input.close();
	}
	public static double calculation(int age, int amount) {
		int difference = LIMIT_AGE - age;
		result = amount / difference;
		return result;
	}

}
