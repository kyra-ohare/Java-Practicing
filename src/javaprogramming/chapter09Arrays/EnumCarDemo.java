package javaprogramming.chapter09Arrays;

public class EnumCarDemo {

	public static void main(String[] args) {
		EnumCar firstCar = new EnumCar(2009, Model.MINIVAN, Color.BLUE);
		EnumCar secondCar = new EnumCar(2011, Model.FOURxFOUR, Color.RED);
		firstCar.display();
		secondCar.display();
	}

}
