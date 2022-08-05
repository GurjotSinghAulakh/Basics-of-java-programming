package variabler2;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

public class Oppgave3 {
    public static void main(String[] args) {
            
        double tall1 = Double.parseDouble(JOptionPane.showInputDialog("Tall 1: "));
        double tall2 = Double.parseDouble(JOptionPane.showInputDialog("Tall 2: "));
        double tall3 = Double.parseDouble(JOptionPane.showInputDialog("Tall 3: "));

        // Adding the three numbers together.
        double sum = tall1 + tall2 + tall3;

        double snitt = sum / 3;

        // It's formatting the output of the sum to only have one decimal.
        DecimalFormat df = new DecimalFormat("#0.#00");

        // It's formatting the output of the sum to only have one decimal.
        System.out.println(df.format(snitt));
    }
    
}
