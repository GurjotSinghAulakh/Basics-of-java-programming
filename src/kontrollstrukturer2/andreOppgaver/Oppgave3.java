package kontrollstrukturer2.andreOppgaver;

import javax.swing.JOptionPane;

public class Oppgave3 {
    public static void main(String[] args) {
        String innInntekt;
        double inntekt;
        double skatt = 0;
        String utskrift = " ";

        // A for loop that runs 3 times.
        // The loop will ask the user to input the income of each person.
        // The loop will then calculate the tax for each person and add it to the variable `skatt`.

        for (int i = 1; i < 4; i++) {
            innInntekt = JOptionPane.showInputDialog("Skriv inn inntekten til personen : " );
            inntekt = Double.parseDouble(innInntekt);

            if (inntekt > 500_000) {
                skatt = (inntekt - 500_000) * 0.5;
                skatt += 500_000 * 0.3;
            } 
            else {
                skatt += 500_000 * 0.3;
            }
            
            utskrift += "Inntekt på " + innInntekt + " kr gir skatt på " + skatt + " kr.\n";
        }

        JOptionPane.showMessageDialog(null, utskrift);
    }
} 
