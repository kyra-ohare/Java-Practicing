/*
 * Exercise 3, page 539.
*/
package javaprogramming.chapter10Inheritance;

public class TennisGame {
    String name1;
    String name2;
    int finalScore1;
    int finalScore2;
    String value1;
    String value2;

    public String getName1() {
        return name1;
    }

    public void setNames(String name1, String name2) {
        this.name1 = name1;
        this.name2 = name2;
    }

    public String getName2() {
        return name2;
    }

    public int getFinalScore1() {
        return finalScore1;
    }

    public int getFinalScore2() {
        return finalScore2;
    }
    
    public void setFinalScores(int finalScore1, int finalScore2) {
        if(finalScore1 == 4 && finalScore2 == 4) {
            this.finalScore1 = -1;
            this.finalScore2 = -1;
        } else if((finalScore1 < 0 || finalScore2 > 4)) {
            this.finalScore1 = -1;
            this.finalScore2 = -1;
        } else if((finalScore1 >= 0 && finalScore1 <= 4) || (finalScore2 >= 0 && finalScore2 <= 4)) {
            this.finalScore1 = finalScore1;
            this.finalScore2 = finalScore2;
        }
    }

    public String getValue1() {
        if(finalScore1 < 0 || finalScore2 > 4)
            this.value1 = "error";
        else if(finalScore1 == 4 && finalScore2 == 4)
            this.value1 = "error";
        else if(finalScore1 == 0)
            this.value1 = "love";
        else if(finalScore1 == 1)
            this.value1 = "15";
        else if(finalScore1 == 2)
            this.value1 = "30";
        else if(finalScore1 == 3)
            this.value1 = "40";
        else if(finalScore1 == 4)
            this.value1 = "game";
        else
            this.value1 = "error";
        return value1;
    }

    public String getValue2() {
        if(finalScore1 < 0 || finalScore2 > 4)
            this.value2 = "error";
        else if(finalScore1 == 4 && finalScore2 == 4)
            this.value2 = "error";
        else if(finalScore2 == 0)
            this.value2 = "love";
        else if(finalScore2 == 1)
            this.value2 = "15";
        else if(finalScore2 == 2)
            this.value2 = "30";
        else if(finalScore2 == 3)
            this.value2 = "40";
        else if(finalScore2 == 4)
            this.value2 = "game";
        else
            this.value2 = "error";
        return value2;
    }
}