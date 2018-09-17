package javaprogramming.chapter08Arrays;

public class Multiplication {
	static int[] number = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
	static int multiply;
	static String message;
	
	public static void main(String[] args) {
		times2();
	}
	
	public static void times2() {
		message = "Times 2";
		System.out.println(message);
		multiply = 2;
		 for(int i = 0; i < number.length; ++i) {
				number[i] *= multiply;
				System.out.println(multiply + " * " + (i+1) + " = " + number[i]);
			}
		
	}
}
