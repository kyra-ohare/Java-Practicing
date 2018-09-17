/*
 * Populating an array
 */

package javaprogramming.chapter08Arrays;

public class DemoArray3 {

	public static void main(String[] args) {
		double[] salaries = {6.25, 6.55, 10.25, 16.85};
				
		System.out.println("Salaries one by one are:");
		for(int i = 0; i < salaries.length; ++i)
			System.out.println(salaries[i]);
	}

}
