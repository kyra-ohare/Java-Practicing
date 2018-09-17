/*
 * Exercise 10, page 542.
*/
package javaprogramming.chapter10Inheritance;

public class Faculty extends CollegeEmployee {
    boolean isTenured;
    String answer;
    
    @Override
    public void settingData() {
        super.settingData();
        System.out.print("Is the faculty tenured (Y/N) >>>> ");
            answer = input.next();
            input.nextLine();
        if(answer.charAt(0) == 'Y' || answer.charAt(0) == 'y')
            isTenured = true;
        
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Is the faulty tenured? " + isTenured);
    }
}