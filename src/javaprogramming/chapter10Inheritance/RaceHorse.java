/*
 * Exercise 1, page 539.
*/
package javaprogramming.chapter10Inheritance;

public class RaceHorse extends Horse {
    int noOfRaces;
    
    public void setNoOfRaces(int noOfRaces) {
        this.noOfRaces = noOfRaces;
    }
    
    public int getNoOfRaces() {
        return noOfRaces;
    }
}
