package kontrollstrukturer2.andreOppgaver;

import javax.swing.JOptionPane;

public class Oppgave7 {
    public static void main(String[] args) {
        int innTall = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn et tall mellom 1 og 10 : "));
        String utskrift = " ";

        // Creating a triangle of stars.
        // The triangle will be created by a for loop.
        for (int i = 0; i <= innTall; i++) {
            for (int j = 0; j < i; j++) {
                utskrift += "*";
            }

            utskrift += "\n";
        }

        JOptionPane.showMessageDialog(null, utskrift);
    }
}
