/*
 * Exercise 9, page 541.
*/
package javaprogramming.chapter10Inheritance;

public class VehicleTest {
    public static void main(String[] args) {
        Car car = new Car(2, 5);
        System.out.println(car.toString());
                
        MotorCycle moto = new MotorCycle(4, 2);
        System.out.println(moto.toString());
    }
}