package aritmetikk;

import javax.swing.*;

/**
 * It asks the user for a length and a width, and then calculates the area of a rectangle with those
 * dimensions
 */ 
public class Oppgave3 {
    public static void main(String[] args) {
        int length = Integer.parseInt(JOptionPane.showInputDialog("Hvor lang er rektangelet?"));
        int width = Integer.parseInt(JOptionPane.showInputDialog("Hvor bred er rektangelet?"));

        int area = length * width;

        JOptionPane.showMessageDialog(null, "Rektangelets area er " + area);
    }
}
