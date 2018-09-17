/*
 * Exercise 1, page 539.
*/
package javaprogramming.chapter10Inheritance;

public class HorsesTest {
    public static void main(String[] args) {
        
        RaceHorse[] horses = new RaceHorse[3];
        horses[0] = new RaceHorse();
        horses[1] = new RaceHorse();
        horses[2] = new RaceHorse();
        
        horses[0].setName("Rex");
        horses[0].setColor("Black");
        horses[0].setBirthYear("2017");
        horses[0].setNoOfRaces(1);
        
        horses[1].setName("Apolo");
        horses[1].setColor("White");
        horses[1].setBirthYear("2015");
        horses[1].setNoOfRaces(3);
        
        horses[2].setName("Beta");
        horses[2].setColor("Pink");
        horses[2].setBirthYear("2016");
        horses[2].setNoOfRaces(2);
        
        System.out.println("Horses:");
        for(RaceHorse temp : horses) {
            System.out.println("Name: " + temp.getName());
            System.out.println("Color: " + temp.getColor());
            System.out.println("Birth Year: " + temp.getBirthYear());
            System.out.println("Number of Races: " + temp.getNoOfRaces());
            System.out.println("");
        }
    }
}
