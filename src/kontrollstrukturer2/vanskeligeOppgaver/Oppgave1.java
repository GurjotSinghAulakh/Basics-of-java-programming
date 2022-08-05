package kontrollstrukturer2.vanskeligeOppgaver;

import javax.swing.JOptionPane;

public class Oppgave1 {
    public static void main(String[] args) {

        /********************************** Alternative 1: **********************************************/

        int nummer = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn et heltall for antall : "));

        double pi = 4;
        int fortegn = -1;

        // Calculating pi.
        for (long i = 3; i < nummer; i += 2) {
            pi += fortegn * (4 / (double) i);
            fortegn *= -fortegn;
        }

        JOptionPane.showMessageDialog(null, "Pi = " + pi);
   
   
        /********************************** Alternative 2: **********************************************/

       /** 
        int iterasjoner = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn et heltall for antall : "));
        
        double pi = 0;

        for (int i = 0; i < iterasjoner; i++) {
            pi += 4 * (Math.pow(-1, i)/(2 * i + 1));
        }

        System.out.println("Pi = " + pi);
   
        **/
        
    }

}
