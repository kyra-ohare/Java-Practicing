/*
 * Exercise 2, page 539. 521
*/
package javaprogramming.chapter10Inheritance;

public class CandlesTest {
    public static void main(String[] args) {
        Candle[] candles = new Candle[5];

        candles[0] = new Candle();
        candles[1] = new CandleScented();
        candles[2] = new Candle();
        candles[3] = new CandleScented();
        candles[4] = new Candle();
        
        candles[0].setColor("Blue");
        candles[0].setHeight(1);
        
        candles[1].setColor("Scented Pink");
        candles[1].setHeight(2);
        
        candles[2].setColor("Red");
        candles[2].setHeight(3);
        
        candles[3].setColor("Scented Purple");
        candles[3].setHeight(4);
        
        candles[4].setColor("White");
        candles[4].setHeight(5);
        
        for(Candle temp : candles) {
            System.out.println("Color: " + temp.getColor());
            System.out.println("Height: " + temp.getHeight());
            System.out.println("Price: " + temp.getPrice());
            System.out.println("");
        }
    }
}
