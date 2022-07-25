package aritmetikk;

import java.text.DecimalFormat;

import javax.swing.*;

/**
 * It asks the user for a number of dollars, and then prints out the corresponding amount in Norwegian
 * kroner
 */

 public class Oppgave6 {
    public static void main(String[] args) {
        double dollars = Double.parseDouble(JOptionPane.showInputDialog("Enter the amount in dollars"));
        
        double kroner = dollars * 7.50;
        
        DecimalFormat df = new DecimalFormat("#0.00");
        
        String output = "The amount in Norwegian kroner is " + df.format(kroner);
        
        JOptionPane.showMessageDialog(null, output);
    }
} 