/*
 * Exercise 9, page 173.
 */
package javaprogramming.chapter03;

import java.util.Scanner;

public class Salary {
	public static void main(String[] args) {
		double hourlyRate;
		int regularHours;
		int overtimeHours;
		double payment;
		Scanner input = new Scanner(System.in);
		
		System.out.print("Employee's hourly rate >> ");
		hourlyRate = input.nextDouble();
		System.out.print("Employee's regular hours >> ");
		regularHours = input.nextInt();
		System.out.print("Employee's overtime hours >> ");
		overtimeHours = input.nextInt();
		
		payment = overtimePay(regularHours, hourlyRate, overtimeHours);
		
		System.out.println("\n9.65Employee's overtime pay is: " + payment);
		if(input != null)
			input.close();
	}
	
	public static double overtimePay(int regularHours, double rate, int overtime) {
		double overtimePay = (regularHours * rate) + (overtime * 1.5 * rate);
		return overtimePay;
	}
}
