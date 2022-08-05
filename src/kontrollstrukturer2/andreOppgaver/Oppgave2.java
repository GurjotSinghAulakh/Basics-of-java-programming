package kontrollstrukturer2.andreOppgaver;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave2 {
    public static void main(String[] args) {

        // Asking the user to input a price for a product.
        double innVarePris = Double.parseDouble(showInputDialog("Skriv inn prisen på varen: "));
        double totalPris = 0;

        while (innVarePris > 0) {
            totalPris += innVarePris;
            innVarePris = Double.parseDouble(showInputDialog("Skriv inn prisen på varen: "));
        }

        // Calculating the commission for the total price.
        double kommisjon = totalPris * 0.09;

        // Showing a message dialog with the total price and the commission.
        showMessageDialog(null, "Kommisjonen for totalt " + totalPris + " kr blir " + kommisjon + " kr.");

    }

}
