package kontrollstrukturer1;

import javax.swing.*;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;


public class Oppgave5 {
    public static void main(String[] args) {
        
        String maned = showInputDialog("Måned : ");

        /********************************** Alternative 1: **********************************************/


        switch (maned.toLowerCase()) {
            case "juni":
            case "juli":
            case "august":
                showMessageDialog(null, "Det er sommer");
                break;
            case "september":
            case "oktober":
            case "november":
                showMessageDialog(null, "Det er høst");
                break;
            case "desember":
            case "januar":
            case "februar":
                showMessageDialog(null, "Det er vinter");
                break;
            case "mars":
            case "april":
            case "mai":
                showMessageDialog(null, "Det er vår");
                break;
            default:
                showMessageDialog(null, "Sjekk om du har skrevet riktig månedsnavn!");
                break;
        }

        /********************************** Alternative 2: **********************************************/

        /**
         *  ! can only be run in the newer version of jdk */


        switch (maned.toLowerCase()) {
            case "juni", "juli", "august" -> showMessageDialog(null, "Det er sommer");
            case "september", "oktober", "november" -> showMessageDialog(null, "Det er høst");
            case "desember", "januar", "februar" -> showMessageDialog(null, "Det er vinter");
            case "mars", "april", "mai" -> showMessageDialog(null, "Det er vår");
            default -> showMessageDialog(null, "Sjekk om du har skrevet riktig månedsnavn!");
        }


        /********************************** Alternative 3: **********************************************/


        if (maned.equals("juni") || maned.equals("juli") || maned.equals("august")) {
            showInputDialog(null, "Det er sommer");
        }
        else if (maned.equals("september") || maned.equals("oktober") || maned.equals("november")) {
            showInputDialog(null, "Det er høst");
        }
        else if (maned.equals("desember") || maned.equals("januar") || maned.equals("februar")) {
            showInputDialog(null, "Det er vinter");
        }
        else if (maned.equals("mars") || maned.equals("april") || maned.equals("mai")) {
            showInputDialog(null, "Det er vår");
        }
        else {
            showInputDialog(null, "Sjekk om du har skrevet riktig månedsnavn!");
        }
    }
}
