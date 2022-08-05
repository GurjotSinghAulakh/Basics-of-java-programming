package variabler1;

import javax.swing.JOptionPane;

public class Oppgave1_2_3_4 {
    public static void main(String[] args) {
        String fornavn = JOptionPane.showInputDialog("Fornavn: ");
        String etternavn = JOptionPane.showInputDialog("Etternavn: ");
        String alder = JOptionPane.showInputDialog("Alder: ");
        String adresse = JOptionPane.showInputDialog("Adresse: ");
        String poststed = JOptionPane.showInputDialog("Poststed: ");
        String postnr = JOptionPane.showInputDialog("Postnr: ");


        // Oppgave 1:
        String utskrift1 = "Du heter " + fornavn + " " + etternavn;


        // Oppgave 2:
        String utskrift2 = "Alderen til " + fornavn + " " + etternavn +
        " er " + alder + " år.";
    
        
        // Oppgave 3:
        String utskrift3 = fornavn + " " + etternavn + " bor i " +
        adresse + " som har postnummer " + postnr + " i " +
        poststed + ". " + fornavn + "´s alder er " + alder + " år.";


        // Oppgave 4:
        String utskrift4 = "Navn: " + fornavn + " " + etternavn + "\n" +
                            "Adresse: " + adresse + "\n" +
                            "Postnummer: " + postnr + "\n" +
                            "Poststed: " + poststed + "\n" +
                            "Alder: " + alder + " år.";
        
        // JOptionPane.showMessageDialog(null, utskrift1);
        // JOptionPane.showMessageDialog(null, utskrift2);
        // JOptionPane.showMessageDialog(null, utskrift3);                   
        // JOptionPane.showMessageDialog(null, utskrift4);
    
    }


}

