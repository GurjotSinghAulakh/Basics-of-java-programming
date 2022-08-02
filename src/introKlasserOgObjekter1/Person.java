package introklasserogobjekter1;

import javax.swing.JOptionPane;

public class Person {

    // Declaring the variables that will be used in the class.
    public String navn;
    public int telefonnr;
    public String adresse;
    public int fodselsar;

    /**
     * It returns the age of the person
     * 
     * @return The age of the person.
     */

    public int finnAlder() {
        return 2022 - fodselsar;
    }

    /**
     * The function `skrivUtOppgave3` takes an integer as an argument and prints out a string with the
     * name, address, phone number and age of the person
     * 
     * @param alder The age of the person.
     */

    public void skrivUtOppgave3(int alder) {
        String utskrift = navn + " med adresse " + adresse + " med telefonnummer " + telefonnr + 
                        " er " + alder + " år gammel."; 

        System.out.println(utskrift);
    }

    /**
     * It takes an integer as an argument, and displays a message dialog with the person's name, address,
     * phone number, and age
     * 
     * @param alder The age of the person.
     */
    
    public void skrivUtOppgave4(int alder) {
        String utskrift = "Navn: "  + navn + "\n" + 
                        "Adresse: " + adresse + "\n" +
                        "Telefonnummer: " + telefonnr + "\n" +
                        "Alder: " + alder + " år.";

        JOptionPane.showMessageDialog(null, utskrift);
    }
}
