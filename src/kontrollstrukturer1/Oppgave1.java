package kontrollstrukturer1;

import javax.swing.*;

public class Oppgave1 {

    public static void main(String[] args) {
        
        // Asking the user for input and then parsing it to an integer.
        int alder = Integer.parseInt(JOptionPane.showInputDialog("Hva er alderen din? : "));

        // Checking if the user is between 18 and 20 years old.
        if (alder >= 18 && alder <=20) {
            JOptionPane.showMessageDialog(null, "Du er myndig, men kan ikke kjøpe " +
            "alkohol med mer enn 22% på polet");
        } 
        
        // The else statement. It is executed if the if statement is false.
        else {
            JOptionPane.showMessageDialog(null, "Du er enten ikke myndig eller så kan du kjøpe " +
            "hva du vil på polet");
        }
    }
    
}
