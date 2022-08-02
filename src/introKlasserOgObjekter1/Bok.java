package introKlasserOgObjekter1;

import javax.swing.JOptionPane;

public class Bok {

    // Declaring the variables.
    public String tittel;
    public double pris;
    public String forfatter;
    public String isbn;

    /**
     * It prints out the title, price, author and ISBN of the book
     */

    public void skrivUtOppgave1() {
        System.out.println("Tittel: " + tittel);
        System.out.println("Pris: " + pris);
        System.out.println("Forfatter: " + forfatter);
        System.out.println("ISBN: " + isbn);
    }

    /**
     * It creates a string with the book's title, price, author and ISBN, and then displays it in a dialog
     * box
     */
    public void skrivUtOppgave2() {
        String utskrift = "Tittel: " + tittel + "\nPris: " + pris + "\nForfatter: " + forfatter + "\nISBN: " + isbn;
        JOptionPane.showMessageDialog(null, utskrift);
    }
}
