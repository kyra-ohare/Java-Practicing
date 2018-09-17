/*
 * Using prefix ++, the result is calculated and then its value is used.
 * Using postfix ++, the value of the expression before the increase is stored.
 * 
 * Choosing whether to use a prefix or a postfix operator is important when one is part of a larger expression.
 * For example, if d is 5, then 2 * ++d is 12, but 2 * d++ is 10.
 */

package javaprogramming.chapter06Looping;

public class IncrementDemo {

	public static void main(String[] args) {
		int myNumber, answer;
		myNumber = 17;
		System.out.println("Before incrementing, myNumber is " + myNumber);
		answer = ++myNumber;
		System.out.println("After prefix increment (++myNumber), myNumber is " + myNumber);
		System.out.println(" and answer is " + answer);
		
		System.out.println();
		
		myNumber = 17;
		System.out.println("Before incrementing, myNumber is " + myNumber);
		answer = myNumber++;
		System.out.println("After postfix increment (myNumber++), myNumber is " + myNumber);
		System.out.println(" and answer is " + answer);
		System.out.println();
		
		int v = 4;
		int plusPlusV = ++v; //v = 5
		v = 4;
		int vPlusPlus = v++; //v = 4
		int t = v++; // v = 5
		System.out.println("v is " + v);
		System.out.println("++v is " + plusPlusV);
		System.out.println("v++ is " + vPlusPlus);
		System.out.println(t);
		
		int w= 17, x = 17, y = 18;
		boolean compare1 = (++w == y);
		boolean compare2 = (x++ == y);
		System.out.println("compare1: " + compare1);
		System.out.println("compare2: " + compare2);
	}

}
