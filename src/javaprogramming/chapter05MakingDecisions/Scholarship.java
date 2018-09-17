/*
 * Exercise 4, page 291.
 */
package javaprogramming.chapter05MakingDecisions;

import java.util.Scanner;

public class Scholarship {
	static double gpa;
	static double MAX_GPA = 3.8;
	static double MED_GPA = 3.4;
	static double LOW_GPA = 3.0;
	static int extracurricularActivities;
	static int MAX_EXTRA = 3;
	static int MED_EXTRA = 2;
	static int MIN_EXTRA = 1;
	static int serviceActivities;
	static int MAX_SERVICE = 3;
	static int MIN_SERVICE = 1;
	
	public static void scholarship(double gpa, int extracurricularActivities, int serviceActities) {
		if(gpa >= MAX_GPA && extracurricularActivities >= MIN_EXTRA && serviceActities >= MIN_SERVICE)
			System.out.println("Scholarship candidate");
		else
			if(gpa < MAX_GPA && gpa >= MED_GPA && extracurricularActivities >= MAX_EXTRA && serviceActities >= MAX_SERVICE)
			System.out.println("Scholarship candidate2");
		else
			if(gpa < MED_GPA && gpa >= LOW_GPA && extracurricularActivities >= MED_EXTRA && serviceActities >= MAX_SERVICE)
			System.out.println("Scholarship candidate3");
		else
			System.out.println("Not a candidate");
	}
	
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		
		System.out.println("What is the student's grade?");
		gpa = input.nextDouble();
		System.out.println("How many extracurricular activities?");
		extracurricularActivities = input.nextInt();
		System.out.println("How many service activities?");
		serviceActivities = input.nextInt();
		
		scholarship(gpa, extracurricularActivities, serviceActivities);

		if(input != null)
			input.close();
	}
}
