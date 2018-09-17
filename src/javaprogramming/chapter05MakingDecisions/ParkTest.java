/*
 * Exercise 8, page 293.
 */
package javaprogramming.chapter05MakingDecisions;

import java.util.Scanner;

public class ParkTest {
    static Park[] parks;
    static String ans;
    static int num;
    static Scanner input = new Scanner(System.in);
    
    public static void getInfo() {
        System.out.println("How many parks are you keying in?");
        num = input.nextInt();
        parks = new Park[num]; //creates slots for Park array

        for(int i = 0; i < parks.length; ++i) {
            parks[i] = new Park(); //creates a Park inside the array
            
            System.out.println("What's the name of the park?");
            ans = input.next();
            parks[i].setName(ans);

            System.out.println("How many acres does " + parks[i].getName() + " Park have?");
            num = input.nextInt();
            parks[i].setAcres(num);

            System.out.println("Does it have a picnic? 1 - Yes or 2 - No");
            num = input.nextInt();
            parks[i].setPicnicFacilities(answerBooleanConversion(num));

            System.out.println("Does it have a playground? 1 - Yes or 2 - No");
            num = input.nextInt();
            parks[i].setPlayground(answerBooleanConversion(num));

            System.out.println("Does it have a tennis court? 1 - Yes or 2 - No");
            num = input.nextInt();
            parks[i].setTennisCourt(answerBooleanConversion(num));

            System.out.println("Does it have a swimming pool? 1 - Yes or 2 - No");
            num = input.nextInt();
            parks[i].setSwimmingPool(answerBooleanConversion(num));
        }
    }

    public static boolean answerBooleanConversion(int num) {
        return num == 1 ? true : false;
    }
    
    public static boolean picnicAndPlayground(Park p) {
        return (p.isPicnicFacilities() && p.isPlayground()) ? true : false;
    }
    
    public static boolean requests(Park p, boolean picnicFacilities, boolean tennisCourt, boolean playground, boolean swimmingPool) {
        return (p.isPicnicFacilities() && p.isTennisCourt() && p.isPlayground() && p.isSwimmingPool()) ? true : false;
    }
    
    public static int numberOfFeatures(Park p) {
        int features = 0;
        if(p.isPicnicFacilities())
            ++features;
        if(p.isPlayground())
            ++features;
        if(p.isSwimmingPool())
            ++features;
        if(p.isTennisCourt())
            ++features;
        return features;
    }
    
    public static Park biggerPark(Park one, Park two) {
        return (one.getAcres() > two.getAcres()) ? one : two;
    }
    
    public static void altogether() {
        for(Park temp : parks) {
            if(picnicAndPlayground(temp))
                System.out.println(temp.getName() + " has both picnic facilities and a playground");
            else
                System.out.println(temp.getName() + " has either picnic facilities or a playground");
            
            if(requests(temp, temp.isPicnicFacilities(), temp.isTennisCourt(), temp.isPlayground(), temp.isSwimmingPool()))
                System.out.println(temp.getName() + " has all the requested features");
            else
                System.out.println(temp.getName() + " does not have all the requested features");
            
            int features = numberOfFeatures(temp);
            System.out.println(temp.getName() + " has " + features + " number of features");
        }
        
        System.out.println("Would you like to compare park sizes? 1 - Yes or 2 - No");
        num = input.nextInt();
        if(num == 1)
            compareParks();
    }
    
    public static void compareParks() {
        do {
            for(int i = 0; i < parks.length; ++i) {
                System.out.println((i+1) + " " + parks[i].getName());
            }
            
            System.out.println("Enter the first number corresponding to the park you wish to compare with");
            num = input.nextInt();
            Park park1 = numberToParkConversion(num-1);
            System.out.println("Enter the second number corresponding to the park you wish to compare with");
            int num2 = input.nextInt();
            Park park2 = numberToParkConversion(num2-1);
            
            System.out.println(biggerPark(park1, park2).getName() + " is the biggest of the two");
            
            System.out.println("Would you like to compare park sizes again? 1 - Yes or 2 - No");
            num = input.nextInt();
        } while(num == 1);
    }

    public static Park numberToParkConversion(int num) {
        Park p = null;
        for(int i = 0; i < parks.length; ++i) {
            if(i == num)
                p = parks[i];
        }
        return p;
    }

    public static void main(String[] args) {
        getInfo();
        altogether();
    }
}