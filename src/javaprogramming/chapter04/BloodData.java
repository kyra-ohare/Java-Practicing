/*
 * Exercise 4, page 235.
 */
package javaprogramming.chapter04;

public class BloodData{
	String bloodType;
	char rH;
	
	public BloodData(){
		bloodType = "O";
		rH = '+';
	}
	
	public BloodData(String bloodType, char rH){
		this.bloodType = bloodType;
		this.rH = rH;
	}
	
	public void setBloodType(String bloodType){
		this.bloodType = bloodType;
	}
	
	public String getBloodType(){
		return bloodType;
	}
	
	public void setRH(char rH){
		this.rH = rH;
	}
	
	public char getRH(){
		return rH;
	}
	
	public void printBlood(){
		System.out.println("Blood Type: " + bloodType);
		System.out.println("RH: " + rH);
	}
}