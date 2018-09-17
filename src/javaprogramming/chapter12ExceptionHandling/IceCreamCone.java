/*
 * Exercise 7, page 668.
 */
package javaprogramming.chapter12ExceptionHandling;

class IceCreamCone {

    String flavor;
    int scoop;

    IceCreamCone(String flavor, int scoop) {
        setFlavor(flavor);

        try {
            setScoop(scoop);
        } catch (IceCreamConeException e) {
            System.err.println(e.getMessage());
        }

        System.out.println("Success>>>> Flavor: " + getFlavor() + " / Number of scoops: " + getScoop());
    }

    public void setFlavor(String flavor) {
        this.flavor = flavor;
    }

    public void setScoop(int scoop) throws IceCreamConeException {
        final byte LIMIT = 3;

        if (scoop <= LIMIT) {
            this.scoop = scoop;
        } else {
            throw (new IceCreamConeException(scoop + " scoops. Limit of " + LIMIT + " scoops."));
        }
    }

    public String getFlavor() {
        return flavor;
    }

    public int getScoop() {
        return scoop;
    }
}