/*
 * Exercise 4, page 539.
*/
package javaprogramming.chapter10Inheritance;

public class Year {
    int days_in_a_year;
    int noOfDays = 0;
    int[] days_in_a_Month = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public Year() {
        days_in_a_year = 365;
    }
    
    public int getDays_in_a_year() {
        return days_in_a_year;
    }
    
    public int daysElapsed(int day, int month) {
        exit:
        for(int i = 0; i < days_in_a_Month.length; ++i) {
            for(int j = 1; j < days_in_a_Month[i]+1; ++j) { //days INSIDE a month
                noOfDays++;
                if(day == j && month == i+1)
                    break exit;
            }
        }
        return noOfDays;
    }
}
