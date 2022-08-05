package kontrollstrukturer2.andreOppgaver;

import javax.swing.JOptionPane;

public class Oppgave8 {
    public static void main(String[] args) {
        int nummer;
        int tall1;
        int tall2;

        do {
            nummer = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn et femsifret tall : "));
        } 
        
        while (nummer > 10_000 || nummer < 100_000);

        boolean palindrom1 = false;
        boolean palindrom2 = false;

        tall1 = nummer / 10_000; // Henting ut sifret som er størst i tallet.
        tall2 = nummer % 10; // Henting ut sifret som er minst i tallet.

        // Checking if the number is a palindrome.
        if (tall1 == tall2) {
            palindrom1 = true;
        }

        nummer = (nummer - tall1 * 10_000) / 10; // Henting ut sifret som er størst i tallet.

        tall1 = nummer / 100; // Henting ut sifret som er størst i tallet.
        tall2 = nummer % 10; // Henting ut sifret som er minst i tallet.

        // Checking if the number is a palindrome.
        if (tall1 == tall2) {
            palindrom2 = true;
        }

        // If the number is a palindrome, it will print out the number.
        if (palindrom1 && palindrom2) {
            JOptionPane.showMessageDialog(null, "Tallet er et palindrom");
        } 
        
        else {
            JOptionPane.showMessageDialog(null, "Tallet er ikke et palindrom");
        }
    }
}
