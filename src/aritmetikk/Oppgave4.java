package aritmetikk;

import javax.swing.*;
import java.text.DecimalFormat;

/**
 * It calculates the circumference of a circle with a given radius
 */ 
public class Oppgave4 {
    public static void main(String[] args) {
        double radius = Double.parseDouble(JOptionPane.showInputDialog("Enter the radius of the circle"));

        double circumference = 2 * Math.PI * radius;

        DecimalFormat df = new DecimalFormat("#0.00");

        String output = "The circumference of the circle is " + df.format(circumference);

        JOptionPane.showMessageDialog(null, output);
    }
}
