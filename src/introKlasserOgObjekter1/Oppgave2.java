package introKlasserOgObjekter1;

import javax.swing.JOptionPane;

public class Oppgave2 {
    public static void main(String[] args) {

       // Creating a new instance of the class Bok.
        Bok enBok = new Bok();

        // Setting the values of the variables in the class Bok.
        enBok.tittel = JOptionPane.showInputDialog("Tittel: ");
        enBok.pris = Double.parseDouble(JOptionPane.showInputDialog("Pris: "));
        enBok.forfatter = JOptionPane.showInputDialog("Forfatter: ");
        enBok.isbn = JOptionPane.showInputDialog("ISBN: ");

        // Calling the method `skrivUtOppgave2()` from the class `Bok`.
        enBok.skrivUtOppgave2();
    }
}
