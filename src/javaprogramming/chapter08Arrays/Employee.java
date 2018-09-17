/*
 * Class created to use in an array.
 */
package javaprogramming.chapter08Arrays;

public class Employee {
	private int empNum;
	private double empSal;
	
	Employee(int e, double s) {
		empNum = e;
		empSal = s;
	}
	
	public int getEmpNum() {
		return empNum;
	}
	
	public double getEmpSal() {
		return empSal;
	}
}
