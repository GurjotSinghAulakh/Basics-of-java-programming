package variabler2;

import javax.swing.JOptionPane;

public class Oppgave2 {
    public static void main(String[] args) {
        
        double tall1 = Double.parseDouble(JOptionPane.showInputDialog("Tall 1: "));
        double tall2 = Double.parseDouble(JOptionPane.showInputDialog("Tall 2: "));
        double tall3 = Double.parseDouble(JOptionPane.showInputDialog("Tall 3: "));

        // Adding the three numbers together.
        double sum = tall1 + tall2 + tall3;

        // Printing out the sum of the three numbers.
        System.out.println("Summen av tallene er: " + sum);
    }
}
