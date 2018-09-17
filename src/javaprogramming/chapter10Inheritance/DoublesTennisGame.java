/*
 * Exercise 3, page 539.
*/
package javaprogramming.chapter10Inheritance;

public class DoublesTennisGame extends TennisGame {
    String name3;
    String name4;

    public String getName3() {
        return name3;
    }

    public String getName4() {
        return name4;
    }
    
    public void setNames(String name1, String name2, String name3, String name4) {
        super.name1 = name1;
        super.name2 = name2;
        this.name3 = name3;
        this.name4 = name4;
    }
    
    @Override
    public void setNames(String name1, String name2) {}
}
