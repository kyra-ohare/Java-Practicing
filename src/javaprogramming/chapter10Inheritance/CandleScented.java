/*
 * Exercise 2, page 539.
*/
package javaprogramming.chapter10Inheritance;

public class CandleScented extends Candle {
    String scent;

    public String getScent() {
        return scent;
    }

    public void setScent(String scent) {
        this.scent = scent;
    }
    
    @Override
    public void setHeight(int height) {
        this.price = height * 3;
        this.height = height;
    }
}