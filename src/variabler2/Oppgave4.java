package variabler2;

import javax.swing.JOptionPane;

public class Oppgave4 {
    public static void main(String[] args) {
        
        double tall1, tall2, tall3;

        // Trying to parse the input from the user as a double.
        try {
            tall1 = Double.parseDouble(JOptionPane.showInputDialog("Tall 1: "));
            tall2 = Double.parseDouble(JOptionPane.showInputDialog("Tall 2: "));
            tall3 = Double.parseDouble(JOptionPane.showInputDialog("Tall 3: "));
        } 

        // It catches the exception and sets the variables to 0.
        catch (Exception e) {
            tall1 = 0;
            tall2 = 0;
            tall3 = 0;
            JOptionPane.showMessageDialog(null, "Du skrev inn noe som ikke er et tall.");
        }

        // Adding the three variables together and storing the result in the variable `sum`.
        double sum = tall1 + tall2 + tall3;

        // Dividing the sum of the three variables by 3.
        double snitt = sum / 3;

        // It prints the value of the variable `snitt` to the console.
        System.out.println(snitt);
    }
}
