package javaprogramming.chapter08Arrays;

import javaprogramming.chapter05MakingDecisions.DigitalCamera;

public class DigitalCameraArray {
    public static void main(String[] args) {
        DigitalCamera[] dc = new DigitalCamera[4];
        dc[0] = new DigitalCamera("Nikon", 10);
        dc[1] = new DigitalCamera("Yamahama", 6);
        dc[2] = new DigitalCamera("Kodak", 7);
        dc[3] = new DigitalCamera("Nokia", 5);
        
        for(int i = 0; i < dc.length; ++i) {
            dc[i].display();
        }
    }
}
