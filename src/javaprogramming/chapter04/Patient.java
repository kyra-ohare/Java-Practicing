/*
 * Exercise 4, page 235.
 */
package javaprogramming.chapter04;

public class Patient{
	int ID;
	int age;
	BloodData bloodData;
	
	public Patient(){
		ID = 0;
		age = 18;
		bloodData = new BloodData("O", '+');
	}
	
	public Patient(int ID, int age, String bloodType, char rH){
		this.ID = ID;
		this.age = age;
		bloodData = new BloodData(bloodType, rH);
	}
	
	public int getID(){
		return ID;
	}
	
	public void setID(int ID){
		this.ID = ID;
	}
	
	public int getAge(){
		return age;
	}
	
	public void setAge(int age){
		this.age = age;
	}
	
	public BloodData getBloodData(){
		System.out.println("Blood Type: " + bloodData);
		return bloodData;
	}
	
	public void setBloodData(BloodData bloodData){
		this.bloodData = bloodData;
	}
	
	public void printPatient(){
		System.out.println("Patient's ID: " + ID);
		System.out.println("Patient's age: " + age);
		bloodData.printBlood();
	}
}