/*
 * Exercise 4, page 235.
 */
package javaprogramming.chapter04;

public class PatientTest{
	public static void main(String[] args){
		Patient patient1 = new Patient();
		patient1.printPatient();
		
		System.out.println("--------------------");
		
		Patient patient2 = new Patient(56897, 31, "AB", '-');
		patient2.printPatient();
		
		System.out.println("--------------------");
		
		Patient patient3 = new Patient(1236, 60, "ABCD", '-');
		patient3.printPatient();
	}
}