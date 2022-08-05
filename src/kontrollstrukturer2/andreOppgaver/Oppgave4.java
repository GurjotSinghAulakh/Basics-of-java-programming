package kontrollstrukturer2.andreOppgaver;

import javax.swing.JOptionPane;

public class Oppgave4 {
    public static void main(String[] args) {
        int teller = 0;
        int nummer = 0;
        int storst = 0;

        /********************************** Alternative 1: **********************************************/


        // Asking the user to input a number, and then it is checking if the number is bigger than the
        // previous number. If it is, it will set the number to the biggest number.
        while (teller < 10) {
            nummer = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn et tall: "));
            if (nummer > storst) {
                storst = nummer;
            }
            teller++;
        }

        System.out.println("Største tall er " + storst);

        /********************************** Alternative 2: **********************************************/

        /**
        for (int i = 0; i <= 10; i++) {
            int nummer = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn et tall: "));
            if (nummer > storst) {
                storst = nummer;
            }
        }

        JOptionPane.showMessageDialog(null, "Største tall er " + storst);
    
        **/
    }


}
