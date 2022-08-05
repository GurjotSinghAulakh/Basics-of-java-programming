package kontrollstrukturer2.andreOppgaver;

import javax.swing.JOptionPane;

public class Oppgave9 {
    public static void main(String[] args) {

        /********************************** Alternative 1: **********************************************/

        int nummer = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn et heltall for fakultet : "));
        int resultat = nummer;
        String utskrift = " ";

        utskrift += nummer + "! = " + resultat + " * ";
        
        // A for loop that is counting down from the number that the user inputted.
        // The resultat will be multiplied by the number that is being counted down.
        // The resultat will be printed out.
        for (int i = nummer - 1; i > 0; i--) {
            resultat *= i;
            if (i != 1) {
                utskrift += i + " * ";
            } else {
                utskrift += i + " = " + resultat;
            }
        }

        JOptionPane.showMessageDialog(null, utskrift);

    }

    /********************************** Alternative 2: **********************************************/

    /** 
     * ! Using recursion.
     */

    public static long fakultet(int nummer) {
        if (nummer <= 1) {
            return 1;
        } 
        
        else {
            return nummer * fakultet(nummer - 1);
        }
    }

}
