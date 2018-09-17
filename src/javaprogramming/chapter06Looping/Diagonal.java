/*
 * Exercise 8, page 343.
 */
package javaprogramming.chapter06Looping;

public class Diagonal {

	public static void main(String[] args) {
		int iterations = 5;
		
		for(int i = 1; i <= iterations; i++) {
			System.out.println(i + " <= " + iterations + ": " + (i <= iterations));
		//	System.out.println("i: " + i);
			//System.out.println();
			
			
			for(int j = 1; j <= i; j++) {
				System.out.println(j + " <= " + i + ": " + (j <= i));
			//	System.out.println("j: " + j);
				//System.out.println();
				
				
				if(j != i) {
				//	System.out.println("(j != i): " + (j != i));
					System.out.println("j: " + j + " != " + "i: " + i);
					System.out.print("_");
					System.out.println();
				
				} else
					if(j == i) {
					//	System.out.println("(j == i): " + (j == i));
						System.out.println("j: " + j + " == " + "i: " + i);
						System.out.print("K");
						System.out.println();
					}
			}
			System.out.println();
		}
	}

}
