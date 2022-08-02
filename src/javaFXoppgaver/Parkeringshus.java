package javaFXoppgaver;

import java.util.ArrayList;

public class Parkeringshus {

    // Creating a new ArrayList of type Bil.
    private ArrayList<Bil> biler = new ArrayList<>();

    /**
     * This function adds a car to the list of cars and returns a string saying that the car has been
     * added.
     * 
     * @param enBil This is the car that is being parked.
     * @return A string
     */

    public String reserverPlass(Bil enBil) {
        biler.add(enBil);
        return "Plass reservert!";
    }

    /**
     * If the car is in the list, remove it and return a message saying that the space has been freed.
     * If the car is not in the list, return a message saying that the car was not found.
     * 
     * @param regNr The registration number of the car.
     * @return The method returns a string.
     */
    
    public String frigjorPlass(String regNr) {
        for (Bil enBil : biler) {
            if (enBil.regNr.equals(regNr)) {
                biler.remove(enBil);
                return "Plass frigjort!";
            }
        }
        return "Systemet finner ikke bilen!";
    }
}
