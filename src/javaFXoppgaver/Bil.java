package javaFXoppgaver;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Bil {
    
    public String regNr;
    public Date startTid;
    public int plass;

    // True : if the car is parked. False : if the car is not parked.
    public boolean kortTid;

    public Bil(String regNr, Date startTid, boolean kortTid) {
        this.regNr = regNr;
        this.startTid = startTid;
        this.kortTid = kortTid;
    }

    /**
     * It takes a date, formats it to a string, and returns it
     * 
     * @return A string with the receipt for the parking.
     */
    
    public String formaterKvittering() {
        String startDatoTid = new SimpleDateFormat("dd.MM.yyyy HH:mm").format(startTid);
        String dagensDato = new SimpleDateFormat("dd.MM.yyyy").format(new Date());

        return "Kvittering for parkering\n" +
                "Reg.nr: " + regNr + "\n" +
                "Starttid: " + startDatoTid + "\n" +
                "Dagens dato: " + dagensDato + "\n" +
                "Avgift: " + avgift();
    }

    /**
     * If the variable kortTid is true, the function returns 20, otherwise it returns 10
     * 
     * @return The price of the ticket.
     */

    public double getPris() {
        
        if (kortTid) {
            return 20;
        } 
        
        else {
            return 10;
        }
    }

    // Calculating the price of the ticket.
    public double avgift() {
        Date dagensDato = new Date();
        long varighet = dagensDato.getTime() - startTid.getTime();
        int antallTimer = (int) varighet / 10_000;
        return antallTimer * getPris();
    }
}
