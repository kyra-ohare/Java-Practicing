/*
 * Exercise 6, page 540.
*/
package javaprogramming.chapter10Inheritance;

public class PackageTest {
    public static void main(String[] args) {
        Package[] pac = new Package[5];
            pac[0] = new Package(8, 'a'); //2
            pac[1] = new Package(8, 'm'); //0.5
            pac[2] = new Package(16, 'A'); //3.0
            pac[3] = new Package(25, 'M'); //2.15
            pac[4] = new Package(17, 't'); //3.25
        
        InsuredPackage[] insPac = new InsuredPackage[5];
            insPac[0] = new InsuredPackage(8, 'a'); //5.95
            insPac[1] = new InsuredPackage(8, 'm'); //2.95
            insPac[2] = new InsuredPackage(16, 'A'); //6.95
            insPac[3] = new InsuredPackage(25, 'M'); //6.10
            insPac[4] = new InsuredPackage(17, 't'); //8.80
        
        System.out.println("Package");
        for(Package temp : pac) {
            temp.display();
            System.out.println("");
        }
        System.out.println("InsuredPackage");
        for(Package temp : insPac) {
            temp.display();
            System.out.println("");
        }
    }
}