package kontrollstrukturer2.andreOppgaver;

import javax.swing.JOptionPane;

public class Oppgave5 {
    public static void main(String[] args) {
        
        int nummer;
        int storsteTall = 0;
        int nestStorsteTall = 0;

    
        // A for loop that asks the user to input a number 10 times.
        for (int i = 0; i <= 10; i++) {
            nummer = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn et tall: "));
            // Checking if the number is bigger than the previous number. If it is, it will set the
            // number to the biggest number.
            if (nummer > storsteTall) {
                nestStorsteTall = storsteTall;
                storsteTall = nummer;
            } 
            
            // Checking if the number is bigger than the second biggest number. If it is, it will set
            // the number to the second biggest number.
            else if (nummer > nestStorsteTall) {
                nestStorsteTall = nummer;
            }
        }

        JOptionPane.showMessageDialog(null, "Største tall er " + storsteTall + " og nest største tall er " + nestStorsteTall);

    }
}
