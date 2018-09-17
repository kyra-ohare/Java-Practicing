/*
 * Exercise 4, page 539.
*/
package javaprogramming.chapter10Inheritance;

public class LeapYear extends Year {
    
    public LeapYear() {
        super.days_in_a_year = 366;
    }
    
    @Override
    public int daysElapsed(int day, int month) {
        noOfDays = super.daysElapsed(day, month) + 1;
        return noOfDays;
    }
}