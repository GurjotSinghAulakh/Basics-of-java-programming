package aritmetikk;

import java.text.DecimalFormat;

import javax.swing.*;

/**
 * It asks the user to input a temperature in Fahrenheit, converts it to Celsius, and prints the result
 */ 

 public class Oppgave5 {
    public static void main(String[] args) {
        double fahrenheit = Double.parseDouble(JOptionPane.showInputDialog("Enter the temperature in Fahrenheit"));
        
        double celsius = (fahrenheit - 32) * 5 / 9;
        
        DecimalFormat df = new DecimalFormat("#0.00");
        
        String output = "The temperature in Celsius is " + df.format(celsius);
        
        JOptionPane.showMessageDialog(null, output);
    }
}
