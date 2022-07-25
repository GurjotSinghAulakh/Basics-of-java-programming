package aritmetikk;

import java.text.DecimalFormat;

import javax.swing.JOptionPane;

/**
 * It calculates the result of the expression `1*4+(2*2+1)/(2-1*3)` and prints it to the screen
 */

 public class Oppgave8 {
    public static void main(String[] args) {
        double num1 = Double.parseDouble(JOptionPane.showInputDialog("Enter the first number"));
        double num2 = Double.parseDouble(JOptionPane.showInputDialog("Enter the second number"));
        
        double result = num1 * 4 + (num2 * 2 + num1 ) / (num2-num1*3);

        DecimalFormat df = new DecimalFormat("#0.00");

        String output = "The result is " + df.format(result);

        JOptionPane.showMessageDialog(null, output);
    }
}