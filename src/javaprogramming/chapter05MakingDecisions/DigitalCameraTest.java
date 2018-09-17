/*
 * Exercise 7, page 293.
 */
package javaprogramming.chapter05MakingDecisions;

public class DigitalCameraTest {
    public static void main(String[] args) {
        DigitalCamera dc1 = new DigitalCamera("Nikon", 10);
        DigitalCamera dc2 = new DigitalCamera("Yamahama", 6);
        DigitalCamera dc3 = new DigitalCamera("Kodak", 7);
        DigitalCamera dc4 = new DigitalCamera("Nokia", 5);

        dc1.display();
        dc2.display();
        dc3.display();
        dc4.display();
    }
}
