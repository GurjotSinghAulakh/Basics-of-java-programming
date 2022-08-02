package kontrollstrukturer1;

import javax.swing.*;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;


public class Oppgave3 {
    public static void main(String[] args) {

        // Asking the user for input and then parsing it to an integer.
        int alder = Integer.parseInt(showInputDialog("Hva er alderen din? : "));

        // Checking if the user is old enough to get a driver's license.
        if (alder < 18) {
            showMessageDialog(null, "Du er ikke gammel nok til å ta førerkort!");
        }
        else {
            showMessageDialog(null, "Du er gammel nok til å ta førerkort!");
        }
    }
}
