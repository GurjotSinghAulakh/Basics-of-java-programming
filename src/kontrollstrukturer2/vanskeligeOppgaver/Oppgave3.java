package kontrollstrukturer2.vanskeligeOppgaver;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

import javax.swing.JOptionPane;

public class Oppgave3 {
    public static void main(String[] args) {

        int nummer = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn et tall : "));
        
        /********************************** Alternative 1: **********************************************/

        int c = 0;

        String primtall = " er et primtall.";

        // Checking if the number is a prime number.
        for (int i = 1; i <= nummer; i++) {
            if (nummer % i == 0) {
                c++;
            }

            if (c > 2) {
                primtall = " er ikke et primtall.";
                break;
            }
        }

        showMessageDialog(null, nummer + primtall);
    }
    

        /********************************** Alternative 2: **********************************************/

    /* 

        if (primtall(nummer)) {
            showMessageDialog(null, nummer + " er et primtall.");
        } 
        
        else {
            showMessageDialog(null, nummer + " er ikke et primtall.");
        }
    }

    */

    /**
     * If the number is less than or equal to 1, it's not a prime number. If the number is greater than
     * 1, check if it's divisible by any number between 2 and the number itself. If it is, it's not a
     * prime number. If it isn't, it is
     * 
     * @param tall The number you want to check if it's a prime number or not.
     * @return A boolean value.
     */

    /* 
    
    public static boolean primtall(int tall) {
        
        if (tall <= 1) {
            return false;
        }

        for (int i = 2; i < tall; i++) {
            if (tall % i == 0) {
                return false;
            }
        }

        return true;
    }

    */
    
}
