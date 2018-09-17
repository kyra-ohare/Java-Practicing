/*
 * Exercise 7, page 668.
 */
package javaprogramming.chapter12ExceptionHandling;

class IceCreamCone2 {

    String flavor;
    int scoop;

    IceCreamCone2(String flavor, int scoop) {
        try {
            setFlavor(flavor);
            setScoop(scoop);
            System.out.println("Success>>>> Flavor: " + getFlavor() + " / Number of scoops: " + getScoop());
        } catch (IceCreamConeException e) {
            System.err.println(e.getMessage());
        }
    }

    public void setFlavor(String flavor) throws IceCreamConeException {
        String strawberry = "strawberry";
        String vanilla = "vanilla";
        String chocolate = "chocolate";

        if (flavor.equalsIgnoreCase(strawberry) || flavor.equalsIgnoreCase(vanilla) || flavor.equalsIgnoreCase(chocolate)) {
            this.flavor = flavor;
        } else {
            throw (new IceCreamConeException(flavor + " invalid >>>> " + getScoop() + " scoops."));
        }
    }

    public void setScoop(int scoop) throws IceCreamConeException {
        final byte LIMIT = 3;

        if (scoop <= LIMIT) {
            this.scoop = scoop;
        } else {
            throw (new IceCreamConeException(scoop + " scoops >>>> " + getFlavor() + " flavor."));
        }
    }

    public String getFlavor() {
        return flavor;
    }

    public int getScoop() {
        return scoop;
    }
}