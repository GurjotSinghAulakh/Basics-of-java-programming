package introklasserogobjekter2 ;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

public class Oppgave6 {
    public static void main(String[] args) {

        double vind = Double.parseDouble(showInputDialog("Vimdhastigheten: "));

        // It creates a new object of the class Vind.
        Vind sjekkVind = new Vind(vind);

        String utskrift = "Vindhastigheten er " + sjekkVind.getVindhastighet() + " m/s" + "\n";

        // Checking if the wind is calm or if it is a storm.
        if (sjekkVind.erOrkan()) {
            utskrift += "Det er orkan! \n";
        } 
        
        else if (sjekkVind.erStille()) {
            utskrift += "Det er stille! \n";
        }

       // Formatting the output of the wind speed in knots.
        String knop = String.format("%.2f", sjekkVind.getKnop());
        utskrift += "Knop: " + knop + " knop \n";
        utskrift += "Og det tilsvarer " +  sjekkVind.getBeaufort() + " på beaufort skalaen!";

        showMessageDialog(null, utskrift);


    }
}


