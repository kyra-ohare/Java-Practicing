package javaprogramming.chapter09Arrays;

public class EnumCar {
	private int year;
	private Model model;
	private Color color;
	
	public EnumCar(int yr, Model m, Color c) {
		year = yr;
		model = m;
		color = c;
	}
	
	public void display() {
		System.out.println("Car is a " + year + " " + color + " " + model + ".");
	}
}
