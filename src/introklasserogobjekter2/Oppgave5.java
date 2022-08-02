package introklasserogobjekter2 ;

import static javax.swing.JOptionPane.showInputDialog;

public class Oppgave5 {
    public static void main(String[] args) {

        // Asking the user to input a name, number and saldo.
        String innKontoNavn = showInputDialog("Kontonavn: ");
        String innKontoNummer = showInputDialog("Kontonummer: ");
        String innSaldo = showInputDialog("Saldo: ");

        // Creating a new object of the class Konto.
        Konto sparekonto = new Konto(innKontoNavn, innKontoNummer, Double.parseDouble(innSaldo));

        System.out.println(sparekonto.settInn(100));
        System.out.println(sparekonto.taUt(50));

        sparekonto.utskrift();
    }
}
