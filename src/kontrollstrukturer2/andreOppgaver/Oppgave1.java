package kontrollstrukturer2.andreOppgaver;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave1 {
    public static void main(String[] args) {

        /********************************** Alternative 1: **********************************************/

        // Asking the user to input the number of km and the number of liters used.
        double innAntallKM = Double.parseDouble(showInputDialog("Skriv inn antall km på denne turen: "));
        double innAntallLiter = Double.parseDouble(showInputDialog("Skriv inn antall liter som ble brukt: "));
        double totalAntallKM = 0;
        double totalAntallLiter = 0;


        while (innAntallKM > 0) {
            totalAntallKM += innAntallKM;
            totalAntallLiter += innAntallLiter;
            innAntallKM = Double.parseDouble(showInputDialog("Skriv inn antall km på denne turen: "));
            innAntallLiter = Double.parseDouble(showInputDialog("Skriv inn antall liter som ble brukt: "));
        }

        // Calculating the average consumption per mile and then printing it out.
        double gjennomsnitt = totalAntallLiter /totalAntallKM * 10;
        showMessageDialog(null, "Gjennomsnittelig forbruk per mil er " + gjennomsnitt + " liter.");

        /********************************** Alternative 2: **********************************************/

        /**
        double innAntallKM, innAntallLiter;
        double totalAntallKM = 0, totalAntallLiter = 0;

        do {
            innAntallKM = Double.parseDouble(showInputDialog("Skriv inn antall km på denne turen: "));
            innAntallLiter = Double.parseDouble(showInputDialog("Skriv inn antall liter som ble brukt: "));
            totalAntallKM += innAntallKM;
            totalAntallLiter += innAntallLiter;
        }

        while (innAntallKM > 0) {
            double gjennomsnitt = totalAntallLiter /totalAntallKM * 10;
            showMessageDialog(null, "Gjennomsnittelig forbruk per mil er " + gjennomsnitt + " liter.");
        }

        **/

    }
}
