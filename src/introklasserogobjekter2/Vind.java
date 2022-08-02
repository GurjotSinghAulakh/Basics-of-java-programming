package introklasserogobjekter2 ;

public class Vind {

    // Declaring a variable.
    private double vindhastighet;

    // A constructor.
    public Vind(double vindhastighet) {
        this.vindhastighet = vindhastighet;
    }

    public double getVindhastighet() {
        return vindhastighet;
    }

    /**
     * If the wind speed is greater than 120.0, return true, otherwise return false
     * 
     * @return The method erOrkan() returns a boolean value.
     */

    public boolean erOrkan() {
        if (vindhastighet > 120.0) {
            return true;
        } 

        else {
            return false;
        }
    }

    /**
     * If the wind speed is less than 2.0, return true, otherwise return false
     * 
     * @return The method erStille() returns a boolean value.
     */

    public boolean erStille() {
        if (vindhastighet < 2.0) {
            return true;
        } 

        else {
            return false;
        }
    }

    /**
     * This function takes a wind speed in m/s and returns the wind speed in knots.
     * 
     * @return The wind speed in knots.
     */

    public double getKnop() {
       return vindhastighet / 1.852;
    }

    /**
     * The Beaufort scale is a scale for measuring wind speed. It is an empirical measure for which a
     * full explanation can be found on Wikipedia
     * 
     * @return The beaufort value.
     */
    public double getBeaufort() {
        int beaufort = (int) (Math.pow(vindhastighet / 3.01, 0.6666) + 0.5);
        if (beaufort > 12) {
            beaufort = 12;
        }

        return beaufort;
    }

}
