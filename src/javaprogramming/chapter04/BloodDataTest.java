/*
 * Exercise 4, page 235.
 */
package javaprogramming.chapter04;

public class BloodDataTest{
	public static void main(String[] args){
		BloodData blood1 = new BloodData();
		System.out.println("Blood: " + blood1.getBloodType() + "\nRH: " + blood1.getRH());
		
		blood1.setBloodType("B");
		blood1.setRH('-');
		System.out.println("\nBlood: " + blood1.getBloodType() + "\nRH: " + blood1.getRH());
		
		BloodData blood2 = new BloodData("AB", '-');
		System.out.println("\nBlood: " + blood2.getBloodType() + "\nRH: " + blood2.getRH());
	}
}