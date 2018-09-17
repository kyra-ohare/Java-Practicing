/*
 * Exercise 15, page 345.
 */
package javaprogramming.chapter06Looping;

import java.util.Scanner;

public class BabysittingJobTest {
	public static void main(String[] args) {
		BabysittingJob baby1 = new BabysittingJob();
		BabysittingJob baby2 = new BabysittingJob();
		BabysittingJob baby3 = new BabysittingJob();
		BabysittingJob baby4 = new BabysittingJob();
		
		employee(baby1);
		employee(baby2);
		employee(baby3);

		baby1.display();
		baby2.display();
		baby3.display();
		baby4.display();
	}
	
	public static BabysittingJob employee(BabysittingJob babysitter) {
		double data;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter babysitter code >> ");
		data = input.nextInt();
		babysitter.setBabysitter((int) data);
		
		do {
		System.out.print("Number of children >> ");
		data = input.nextInt();
		babysitter.setNumberOfChildren((int) data);
		}while(data < 0);
		
		System.out.print("Number of hours >> ");
		data = input.nextDouble();
		double round = Math.round(data);
		babysitter.setHours(round);
		
		if(input != null)
			input.close();
		
		return babysitter;
	}
}