/*
 * Exercise 8, page 293.
 */
package javaprogramming.chapter05MakingDecisions;

public class Park {
    private String name;
    private int acres;
    private boolean picnicFacilities;
    private boolean tennisCourt;
    private boolean playground;
    private boolean swimmingPool;

    /*public Park(String name, int acres) {
            this.name = name;
            this.acres = acres;
    }*/

    public Park() {

    }

    public String getName() {
            return name;
    }
    public void setName(String name) {
            this.name = name;
    }
    public int getAcres() {
            return acres;
    }
    public void setAcres(int acres) {
            if(acres >= 0 && acres <= 400)
                    this.acres = acres;
            else {
                    System.out.println("Error: Acre invalid.");
                    this.acres = 0;
            }
    }
    public boolean isPicnicFacilities() {
            return picnicFacilities;
    }
    public void setPicnicFacilities(boolean picnicFacilities) {
            this.picnicFacilities = picnicFacilities;
    }
    public boolean isTennisCourt() {
            return tennisCourt;
    }
    public void setTennisCourt(boolean tennisCourt) {
            this.tennisCourt = tennisCourt;
    }
    public boolean isPlayground() {
            return playground;
    }
    public void setPlayground(boolean playground) {
            this.playground = playground;
    }
    public boolean isSwimmingPool() {
            return swimmingPool;
    }
    public void setSwimmingPool(boolean swimmingPool) {
            this.swimmingPool = swimmingPool;
    }
}
