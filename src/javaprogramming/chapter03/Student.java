/*
 * Exercise 12, page 173.
 */
package javaprogramming.chapter03;

public class Student{
	private String name;
	final int ID;
	static int lastID = 2000;
	private int creditHours = 3;
	private int credits = creditHours;
	private int points = 12;
	private int point = points;
	
	public Student(String name){
		this.name = name;
		ID = lastID++;
	}
	
	public String getName(){
		return name;
	}
	
	public int getID(){
		return ID;
	}
	
	public int getCreditHours(){
		return creditHours;
	}
	
	public void setCreditHours(int hours){
		creditHours *= hours;
	}
	
	public int getPoints(){
		return points;
	}
	
	public int setPoints(){
		points *= getCreditHours();
		return points;
	}
	
	public void display() {
			System.out.println("Student's name: " + getName());
			System.out.println(name + "'s ID number: " + getID());
			if(getCreditHours() == credits)
				System.out.println(name + "'s credit hours: underfined.");
			else
				System.out.println(name + "'s credit hours: " + getCreditHours());
			if(getPoints() == point)
				System.out.println(name + "'s points: underfined.");
			else
				System.out.println(name + "'s points: " + getPoints());
			System.out.println();
	}
}