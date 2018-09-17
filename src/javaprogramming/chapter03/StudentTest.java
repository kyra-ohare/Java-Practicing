/*
 * Exercise 12, page 173.
 */
package javaprogramming.chapter03;

public class StudentTest{
	public static void main(String[] args){
		Student Bob = new Student("Bob");
		Student Clare = new Student("Clare");
		Student Ann = new Student("Ann");
		
		Bob.setCreditHours(10);
		Clare.setCreditHours(20);
		Bob.setPoints();
		Clare.setPoints();
		
		Bob.display();
		Clare.display();
		Ann.display();
	}
}