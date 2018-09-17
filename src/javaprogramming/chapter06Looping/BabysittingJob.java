/*
 * Exercise 15, page 345.
 */
package javaprogramming.chapter06Looping;

import java.time.Year;
import java.time.format.DateTimeFormatter;

public class BabysittingJob {
	String year = Year.now().format(DateTimeFormatter.ofPattern("uu"));
	private static int lastNumber = 0;
	private int number;
	private String empNumber;
	private String name;
	private int numberOfChildren;
	private double hours;
	private double fee;
	private double addFee;
	private double wages;
	
	public BabysittingJob() {
		number = ++lastNumber;
		name = "not assigned";
	}
	
	public String getEmpNumber() {
		number = ++lastNumber;
		this.empNumber = year + String.format("%03d", number);
		return empNumber;
	}
	
	public void setBabysitter(int code) {
		switch(code) {
		case 1:
			this.name = "Cindy";
			this.fee = 7;
			this.addFee = 0;
			break;
		case 2:
			this.name = "Greg";
			this.fee = 9;
			this.addFee = 4;
			break;
		case 3:
			this.name = "Marcia";
			this.fee = 9;
			this.addFee = 4;
			break;
		default:
			this.name = "invalid code.";
		}
	}
	public String getBabysitterName() {
		return name;
	}
	
	public void setNumberOfChildren(int number) {
		numberOfChildren = number;
	}
	public int getNumberOfChildren() {
		return numberOfChildren;
	}
	
	public void setHours(double hours) {
		this.hours = hours;
	}
	public double getHours() {
		return hours;
	}
	
	public double getFee() {
		return fee;
	}
	public double getAddFee() {
		return addFee;
	}
	public double calcWage() {
		if(getBabysitterName() == "Cindy") //TODO: need to use an int instead of a String
			wages = getNumberOfChildren() * getHours() * getFee();
			else
				if(getNumberOfChildren() == 1)
					wages = getFee() * getHours();
					else
						wages = (((getNumberOfChildren() - 1) * getAddFee()) + getFee()) * getHours();
		return wages;
	}
	
	public void display() {
		System.out.println("\nEmployee Number: " + getEmpNumber());
		System.out.println("Employee Name: " + getBabysitterName());
		System.out.println("Employee fee: " + getFee() + " per hour.");
		if(getBabysitterName() != "Cindy")
			System.out.println("Additional: " + getAddFee() + " per hour per child.");
		System.out.println("Number of children: " + getNumberOfChildren());
		System.out.println("Number of hours: " + getHours());
		System.out.println("Wages: " + calcWage());
	}
}