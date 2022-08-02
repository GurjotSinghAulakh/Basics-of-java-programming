package introklasserogobjekter2 ;

import javax.swing.JOptionPane;

public class Oppgave1 {
    public static void main(String[] args) {
        
        // Asking for user input.
        String fornavn = JOptionPane.showInputDialog("Fornavn: ");
        String etternavn = JOptionPane.showInputDialog("Etternavn: ");
        String adresse = JOptionPane.showInputDialog("Adresse: ");
        String telefonnr = JOptionPane.showInputDialog("Telefonnr: ");

        // Creating a new object of the class Person, and then calling the method skrivUt() on that
        // object.
        Person person = new Person(fornavn, etternavn, adresse, telefonnr);
        person.skrivUt();
    }
}
