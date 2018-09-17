package javaprogramming.chapter06Looping;

import java.util.Scanner;

public class BarGraph {

	public static void main(String[] args) {
		int pam;
		int leo;
		int kim;
		int bob;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter cars sold by Pam >> ");
		pam = input.nextInt();
		System.out.print("Enter cars sold by Leo >> ");
		leo = input.nextInt();
		System.out.print("Enter cars sold by Kim >> ");
		kim = input.nextInt();
		System.out.print("Enter cars sold by Bob >> ");
		bob = input.nextInt();
		System.out.println();
		System.out.println("Car Sales for Month");
		
		System.out.print("Pam\t");
		for(int i = 0; i <= pam; i++)
			System.out.print("X");
		System.out.println();
		
		System.out.print("Leo\t");
		for(int i = 0; i <= leo; i++)
			System.out.print("X");
		System.out.println();
		
		System.out.print("Kim\t");
		for(int i = 0; i <= kim; i++)
			System.out.print("X");
		System.out.println();
		
		System.out.print("Bob\t");
		for(int i = 0; i <= bob; i++)
			System.out.print("X");
		
		if(input != null)
			input.close();
	}

}
