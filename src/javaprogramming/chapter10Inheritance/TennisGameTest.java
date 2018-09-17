/*
 * Exercise 3, page 539.
*/
package javaprogramming.chapter10Inheritance;

public class TennisGameTest {
    public static void main(String[] args) {
        TennisGame[] tg = new TennisGame[2];
        DoublesTennisGame[] dtg = new DoublesTennisGame[2];
        
        tg[0] = new TennisGame();
        tg[1] = new TennisGame();
        dtg[0] = new DoublesTennisGame();
        dtg[1] = new DoublesTennisGame();
        
        tg[0].setNames("John", "Peter");
            tg[0].setFinalScores(-1, 5); //error & error
        tg[1].setNames("Mary", "Jessy");
            tg[1].setFinalScores(4, 4); //error & error
        
        dtg[0].setNames("Matthew", "Carl", "Luke", "Adrian");
            dtg[0].setFinalScores(3, 2); //40 & 30
        dtg[1].setNames("Sarah", "Rita", "Jane", "Barbara");
            dtg[1].setFinalScores(0, 4); //love & game
        
        System.out.println("TennisGame");
        for(TennisGame temp : tg) {
            System.out.println("Playes: " + temp.getName1() + " & " + temp.getName2());
            System.out.println("Results: " + temp.getValue1() + " & " + temp.getValue2());
        }
        System.out.println("");
        System.out.println("DoublesTennisGame");
        for(DoublesTennisGame temp : dtg) {
            System.out.println("Playes: " + temp.getName1() + ", " + temp.getName2() + ", " + temp.getName3() + " & " + temp.getName4());
            System.out.println("Results: " + temp.getValue1() + ", " + temp.getValue2());
        }
    }
}
