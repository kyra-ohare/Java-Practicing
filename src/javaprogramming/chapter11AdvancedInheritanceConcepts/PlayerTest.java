/*
 * Exercise 12, page 598.
 */
package javaprogramming.chapter11AdvancedInheritanceConcepts;

public class PlayerTest {
    
    public static void main(String[] args) {
        Player[] player = new Player[3];
        player[0] = new Child();
            player[0].play();
        player[1] = new Musician();
            player[1].play();
        player[2] = new Actor();
            player[2].play();
    }
}