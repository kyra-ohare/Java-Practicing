/*
 * Exercise 3, page 595.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts;

public class AutoTest {
    
    public static void main(String[] args) {
        Auto[] autos = new Auto[2];
        autos[0] = new Ford();
            autos[0].setMake("Ford");
            autos[0].setPrice();
        autos[1] = new Chevy();
            autos[1].setMake("Chevy");
            autos[1].setPrice();
        
        for(Auto temp : autos) {
            System.out.println("Make: " + temp.getMake() + " | Price: " + temp.getPrice());
        }
    }
}